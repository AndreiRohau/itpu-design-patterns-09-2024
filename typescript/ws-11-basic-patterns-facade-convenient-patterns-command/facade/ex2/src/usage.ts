console.log("works")  

function print(text: string) {
    console.log(text)
}

class CloudProviderService {
  public isLoggedIn(isTest: boolean): boolean {
    print('Checks if the user is logged in')
    return isTest
  }
  public logIn(): void {
    print('Logs the user in')
  }
  public convertFile(file: string): string {
    print('Converts the file to a format that the cloud provider accepts')
    return file
  }
  public uploadFile(file: string): void {
    print('Uploads the file to the cloud provider')
  }
  public getFileLink(file: string): string {
    print('Returns the link to the uploaded file')
    return file
  }
}


class CloudProviderFacade {
  private service: CloudProviderService;

  constructor() {
    this.service = new CloudProviderService();
  }

  public uploadFile(file: string): string {
    if (!this.service.isLoggedIn(true)) {
      this.service.logIn();
    }
    const convertedFile = this.service.convertFile(file);
    this.service.uploadFile(convertedFile);
    return this.service.getFileLink(convertedFile);
  }
}

const facade = new CloudProviderFacade();
const fileLink = facade.uploadFile("file.txt");
print("File link:" + fileLink.toString);