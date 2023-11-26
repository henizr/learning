class CustomError extends Error{
    constructor(message){
        super(message);
        this.name = "CustomError";

            if(Error.captureStackTrace){
                Error.captureStackTrace(this, CustomError);
            }
        }
}

class ProductNotFound extends Error{
    constructor(missingProductId){
        super(`Product ${missingProductId} does not exist in the catalog`);
        this.name = "ProductNotFound";
        this.productId = missingProductId;

        if(Error.captureStackTrace){
            Error.captureStackTrace(this, ProductNotFound);
        }
    }
}
