package objectSample.exceptionSample.original;

//独自エラー　入力された値がおかしければ発生する例外
class CreateDataException extends RuntimeException{
    //シリアル化
    private static final long  serialVersionUID = 1L;

    //エラー　チェックする
    private boolean nameError = false;
    private boolean ageError = false;

    public CreateDataException(boolean nameError, boolean ageError) {
        this.nameError = nameError;
        this.ageError = ageError;
    }

    public CreateDataException(String message, boolean nameError, boolean ageError) {
        super(message);
        this.nameError = nameError;
        this.ageError = ageError;
    }

    public CreateDataException(String message, Throwable cause, boolean nameError, boolean ageError) {
        super(message, cause);
        this.nameError = nameError;
        this.ageError = ageError;
    }

    public CreateDataException(Throwable cause, boolean nameError, boolean ageError) {
        super(cause);
        this.nameError = nameError;
        this.ageError = ageError;
    }

    public CreateDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, boolean nameError, boolean ageError) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.nameError = nameError;
        this.ageError = ageError;
    }

    //ゲッター
    public boolean isNameError() {
        return nameError;
    }

    public boolean isAgeError() {
        return ageError;
    }
}
