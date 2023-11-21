class CustomError extends Error {
  constructor(message) {
    super(message);
    this.name = "CustomError";

    if (Error.captureStackTrace) {
      Error.captureStackTrace(this, CustomError);
    }
  }
}

throw new CustomError("An application-specific object occured");
