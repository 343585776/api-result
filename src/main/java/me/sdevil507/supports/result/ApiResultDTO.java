package me.sdevil507.supports.result;


/**
 * Request请求通用结果返回VO
 *
 * @author sdevil507
 */
public class ApiResultDTO {
    /**
     * 执行反馈状态码(0=SUCCESS,非0=ERROR)
     */
    private String code;

    /**
     * 执行反馈消息
     */
    private String message;

    /**
     * 执行反馈实体对象
     */
    private Object content;

    private ApiResultDTO(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.content = builder.content;
    }

    /**
     * 构建器
     */
    static class Builder {
        private String code;

        private String message;

        private Object content;

        Builder(String code, String message) {
            this.code = code;
            this.message = message;
        }

        /**
         * 增加对象类型结果
         *
         * @param content Object
         * @return Builder
         */
        Builder addContent(Object content) {
            this.content = content;
            return this;
        }

        ApiResultDTO create() {
            return new ApiResultDTO(this);
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ApiResultDTO{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", content=" + content +
                '}';
    }
}
