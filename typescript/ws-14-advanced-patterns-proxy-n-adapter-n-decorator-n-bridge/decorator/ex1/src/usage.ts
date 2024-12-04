console.log("works")  

interface DataSource {
  writeData(data: string): void;
  readData(): string;
}

class FileDataSource implements DataSource {
  private fileName: string;
  private data: string;

  constructor(fileName: string) {
    this.fileName = fileName;
  }

  writeData(data: string): void {
    console.log(`[FileDataSource] Writing to file: ${this.fileName}, data: ${data}`);
    this.data = data;
  }

  readData(): string {
    console.log(`[FileDataSource] Reading from file: ${this.fileName}, data: ${this.data}`);
    return this.data;
  }
}

// my example of the decorator
class MyEncryptionDecorator implements DataSource {
  protected source: DataSource;

  constructor(source: DataSource) {
    this.source = source;
  }

  writeData(data: string): void {
    const base64Data = btoa(data);
    console.log(`[My EncryptionDecorator] Encrypted data: ${base64Data}`);
    this.source.writeData(base64Data);
  }

  readData(): string {
    const base64Data = this.source.readData();
    const data = atob(base64Data);
    console.log(`[My EncryptionDecorator] Decrypted data: ${data}`);
    return data;
  }
}

// abstract example
class DataSourceDecorator implements DataSource {
  protected source: DataSource;

  constructor(source: DataSource) {
    this.source = source;
  }

  writeData(data: string): void {
    this.source.writeData(data);
  }

  readData(): string {
    return this.source.readData();
  }
}

// examples from materials
class EncryptionDecorator extends DataSourceDecorator {
  writeData(data: string): void {
    const base64Data = btoa(data);
    console.log(`[EncryptionDecorator] Encrypted data: ${base64Data}`);
    super.writeData(base64Data);
  }

  readData(): string {
    const base64Data = super.readData();
    const data = atob(base64Data);
    console.log(`[EncryptionDecorator] Decrypted data: ${data}`);
    return data;
  }
}

// examples from materials
class ReverseDecorator extends DataSourceDecorator {
  writeData(data: string): void {
    const compressedData = data.split("").reverse().join("");
    console.log(`[ReverseDecorator] Reversed data: ${compressedData}`);
    super.writeData(compressedData);
  }

  readData(): string {
    const compressedData = super.readData();
    const data = compressedData.split("").reverse().join("");
    console.log(`[ReverseDecorator] Unreversed data: ${data}`);
    return data;
  }
}

// check the code
const file = new FileDataSource("file.txt");
const encryptedFile = new EncryptionDecorator(file);

encryptedFile.writeData("Hello world!");
encryptedFile.readData();

console.log('--------')
// my encryption test
const myEncrptedFile1 = new MyEncryptionDecorator(file)
const myEncrptedFile2 = new MyEncryptionDecorator(myEncrptedFile1)
myEncrptedFile2.writeData("Hello world!");
myEncrptedFile2.readData();

/* Output:

  [EncryptionDecorator] Encrypted data: SGVsbG8gd29ybGQh
  [FileDataSource] Writing to file: file.txt, data: SGVsbG8gd29ybGQh
  [FileDataSource] Reading from file: file.txt, data: SGVsbG8gd29ybGQh
  [EncryptionDecorator] Decrypted data: Hello world!
*/