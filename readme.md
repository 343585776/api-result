## 通用API接口返回定义

### 返回字段

```java
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
```

### 使用方式

```java
/**
 * 获取执行结果返回
 *
 * @param code 状态码
 * @param msg  消息
 * @return ApiResultDTO
 * @see ApiResultDTO
 */
public static ApiResultDTO create(String code, String msg) {
    return new ApiResultDTO.Builder(code, msg).create();
}

/**
 * 获取执行结果返回
 *
 * @param code    状态码
 * @param msg     消息
 * @param content 数据
 * @return ApiResultDTO
 * @see ApiResultDTO
 */
public static ApiResultDTO create(String code, String msg, Object content) {
    return new ApiResultDTO.Builder(code, msg).addContent(content).create();
}
```