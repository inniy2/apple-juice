package com.bss.orange;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ghost.proto")
public final class ghostGrpc {

  private ghostGrpc() {}

  public static final String SERVICE_NAME = "ghost";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bss.orange.Ghost.diskRequest,
      com.bss.orange.Ghost.APIResponse> getDiskcheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "diskcheck",
      requestType = com.bss.orange.Ghost.diskRequest.class,
      responseType = com.bss.orange.Ghost.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bss.orange.Ghost.diskRequest,
      com.bss.orange.Ghost.APIResponse> getDiskcheckMethod() {
    io.grpc.MethodDescriptor<com.bss.orange.Ghost.diskRequest, com.bss.orange.Ghost.APIResponse> getDiskcheckMethod;
    if ((getDiskcheckMethod = ghostGrpc.getDiskcheckMethod) == null) {
      synchronized (ghostGrpc.class) {
        if ((getDiskcheckMethod = ghostGrpc.getDiskcheckMethod) == null) {
          ghostGrpc.getDiskcheckMethod = getDiskcheckMethod = 
              io.grpc.MethodDescriptor.<com.bss.orange.Ghost.diskRequest, com.bss.orange.Ghost.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ghost", "diskcheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bss.orange.Ghost.diskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bss.orange.Ghost.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ghostMethodDescriptorSupplier("diskcheck"))
                  .build();
          }
        }
     }
     return getDiskcheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bss.orange.Ghost.definitionRequest,
      com.bss.orange.Ghost.APIResponse> getCheckdefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkdefinition",
      requestType = com.bss.orange.Ghost.definitionRequest.class,
      responseType = com.bss.orange.Ghost.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bss.orange.Ghost.definitionRequest,
      com.bss.orange.Ghost.APIResponse> getCheckdefinitionMethod() {
    io.grpc.MethodDescriptor<com.bss.orange.Ghost.definitionRequest, com.bss.orange.Ghost.APIResponse> getCheckdefinitionMethod;
    if ((getCheckdefinitionMethod = ghostGrpc.getCheckdefinitionMethod) == null) {
      synchronized (ghostGrpc.class) {
        if ((getCheckdefinitionMethod = ghostGrpc.getCheckdefinitionMethod) == null) {
          ghostGrpc.getCheckdefinitionMethod = getCheckdefinitionMethod = 
              io.grpc.MethodDescriptor.<com.bss.orange.Ghost.definitionRequest, com.bss.orange.Ghost.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ghost", "checkdefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bss.orange.Ghost.definitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bss.orange.Ghost.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ghostMethodDescriptorSupplier("checkdefinition"))
                  .build();
          }
        }
     }
     return getCheckdefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bss.orange.Ghost.Empty,
      com.bss.orange.Ghost.APIResponse> getCutoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cutover",
      requestType = com.bss.orange.Ghost.Empty.class,
      responseType = com.bss.orange.Ghost.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bss.orange.Ghost.Empty,
      com.bss.orange.Ghost.APIResponse> getCutoverMethod() {
    io.grpc.MethodDescriptor<com.bss.orange.Ghost.Empty, com.bss.orange.Ghost.APIResponse> getCutoverMethod;
    if ((getCutoverMethod = ghostGrpc.getCutoverMethod) == null) {
      synchronized (ghostGrpc.class) {
        if ((getCutoverMethod = ghostGrpc.getCutoverMethod) == null) {
          ghostGrpc.getCutoverMethod = getCutoverMethod = 
              io.grpc.MethodDescriptor.<com.bss.orange.Ghost.Empty, com.bss.orange.Ghost.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ghost", "cutover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bss.orange.Ghost.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bss.orange.Ghost.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ghostMethodDescriptorSupplier("cutover"))
                  .build();
          }
        }
     }
     return getCutoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bss.orange.Ghost.ghostRequest,
      com.bss.orange.Ghost.APIResponse> getDryrunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "dryrun",
      requestType = com.bss.orange.Ghost.ghostRequest.class,
      responseType = com.bss.orange.Ghost.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bss.orange.Ghost.ghostRequest,
      com.bss.orange.Ghost.APIResponse> getDryrunMethod() {
    io.grpc.MethodDescriptor<com.bss.orange.Ghost.ghostRequest, com.bss.orange.Ghost.APIResponse> getDryrunMethod;
    if ((getDryrunMethod = ghostGrpc.getDryrunMethod) == null) {
      synchronized (ghostGrpc.class) {
        if ((getDryrunMethod = ghostGrpc.getDryrunMethod) == null) {
          ghostGrpc.getDryrunMethod = getDryrunMethod = 
              io.grpc.MethodDescriptor.<com.bss.orange.Ghost.ghostRequest, com.bss.orange.Ghost.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ghost", "dryrun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bss.orange.Ghost.ghostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bss.orange.Ghost.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ghostMethodDescriptorSupplier("dryrun"))
                  .build();
          }
        }
     }
     return getDryrunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bss.orange.Ghost.ghostRequest,
      com.bss.orange.Ghost.APIResponse> getExecuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "execute",
      requestType = com.bss.orange.Ghost.ghostRequest.class,
      responseType = com.bss.orange.Ghost.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bss.orange.Ghost.ghostRequest,
      com.bss.orange.Ghost.APIResponse> getExecuteMethod() {
    io.grpc.MethodDescriptor<com.bss.orange.Ghost.ghostRequest, com.bss.orange.Ghost.APIResponse> getExecuteMethod;
    if ((getExecuteMethod = ghostGrpc.getExecuteMethod) == null) {
      synchronized (ghostGrpc.class) {
        if ((getExecuteMethod = ghostGrpc.getExecuteMethod) == null) {
          ghostGrpc.getExecuteMethod = getExecuteMethod = 
              io.grpc.MethodDescriptor.<com.bss.orange.Ghost.ghostRequest, com.bss.orange.Ghost.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ghost", "execute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bss.orange.Ghost.ghostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bss.orange.Ghost.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ghostMethodDescriptorSupplier("execute"))
                  .build();
          }
        }
     }
     return getExecuteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ghostStub newStub(io.grpc.Channel channel) {
    return new ghostStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ghostBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ghostBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ghostFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ghostFutureStub(channel);
  }

  /**
   */
  public static abstract class ghostImplBase implements io.grpc.BindableService {

    /**
     */
    public void diskcheck(com.bss.orange.Ghost.diskRequest request,
        io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDiskcheckMethod(), responseObserver);
    }

    /**
     */
    public void checkdefinition(com.bss.orange.Ghost.definitionRequest request,
        io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckdefinitionMethod(), responseObserver);
    }

    /**
     */
    public void cutover(com.bss.orange.Ghost.Empty request,
        io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCutoverMethod(), responseObserver);
    }

    /**
     */
    public void dryrun(com.bss.orange.Ghost.ghostRequest request,
        io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDryrunMethod(), responseObserver);
    }

    /**
     */
    public void execute(com.bss.orange.Ghost.ghostRequest request,
        io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDiskcheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bss.orange.Ghost.diskRequest,
                com.bss.orange.Ghost.APIResponse>(
                  this, METHODID_DISKCHECK)))
          .addMethod(
            getCheckdefinitionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bss.orange.Ghost.definitionRequest,
                com.bss.orange.Ghost.APIResponse>(
                  this, METHODID_CHECKDEFINITION)))
          .addMethod(
            getCutoverMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bss.orange.Ghost.Empty,
                com.bss.orange.Ghost.APIResponse>(
                  this, METHODID_CUTOVER)))
          .addMethod(
            getDryrunMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bss.orange.Ghost.ghostRequest,
                com.bss.orange.Ghost.APIResponse>(
                  this, METHODID_DRYRUN)))
          .addMethod(
            getExecuteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bss.orange.Ghost.ghostRequest,
                com.bss.orange.Ghost.APIResponse>(
                  this, METHODID_EXECUTE)))
          .build();
    }
  }

  /**
   */
  public static final class ghostStub extends io.grpc.stub.AbstractStub<ghostStub> {
    private ghostStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ghostStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ghostStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ghostStub(channel, callOptions);
    }

    /**
     */
    public void diskcheck(com.bss.orange.Ghost.diskRequest request,
        io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDiskcheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkdefinition(com.bss.orange.Ghost.definitionRequest request,
        io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckdefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cutover(com.bss.orange.Ghost.Empty request,
        io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCutoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dryrun(com.bss.orange.Ghost.ghostRequest request,
        io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDryrunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void execute(com.bss.orange.Ghost.ghostRequest request,
        io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ghostBlockingStub extends io.grpc.stub.AbstractStub<ghostBlockingStub> {
    private ghostBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ghostBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ghostBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ghostBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bss.orange.Ghost.APIResponse diskcheck(com.bss.orange.Ghost.diskRequest request) {
      return blockingUnaryCall(
          getChannel(), getDiskcheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bss.orange.Ghost.APIResponse checkdefinition(com.bss.orange.Ghost.definitionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckdefinitionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bss.orange.Ghost.APIResponse cutover(com.bss.orange.Ghost.Empty request) {
      return blockingUnaryCall(
          getChannel(), getCutoverMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bss.orange.Ghost.APIResponse dryrun(com.bss.orange.Ghost.ghostRequest request) {
      return blockingUnaryCall(
          getChannel(), getDryrunMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bss.orange.Ghost.APIResponse execute(com.bss.orange.Ghost.ghostRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecuteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ghostFutureStub extends io.grpc.stub.AbstractStub<ghostFutureStub> {
    private ghostFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ghostFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ghostFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ghostFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bss.orange.Ghost.APIResponse> diskcheck(
        com.bss.orange.Ghost.diskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDiskcheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bss.orange.Ghost.APIResponse> checkdefinition(
        com.bss.orange.Ghost.definitionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckdefinitionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bss.orange.Ghost.APIResponse> cutover(
        com.bss.orange.Ghost.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getCutoverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bss.orange.Ghost.APIResponse> dryrun(
        com.bss.orange.Ghost.ghostRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDryrunMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bss.orange.Ghost.APIResponse> execute(
        com.bss.orange.Ghost.ghostRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DISKCHECK = 0;
  private static final int METHODID_CHECKDEFINITION = 1;
  private static final int METHODID_CUTOVER = 2;
  private static final int METHODID_DRYRUN = 3;
  private static final int METHODID_EXECUTE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ghostImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ghostImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DISKCHECK:
          serviceImpl.diskcheck((com.bss.orange.Ghost.diskRequest) request,
              (io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse>) responseObserver);
          break;
        case METHODID_CHECKDEFINITION:
          serviceImpl.checkdefinition((com.bss.orange.Ghost.definitionRequest) request,
              (io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse>) responseObserver);
          break;
        case METHODID_CUTOVER:
          serviceImpl.cutover((com.bss.orange.Ghost.Empty) request,
              (io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse>) responseObserver);
          break;
        case METHODID_DRYRUN:
          serviceImpl.dryrun((com.bss.orange.Ghost.ghostRequest) request,
              (io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse>) responseObserver);
          break;
        case METHODID_EXECUTE:
          serviceImpl.execute((com.bss.orange.Ghost.ghostRequest) request,
              (io.grpc.stub.StreamObserver<com.bss.orange.Ghost.APIResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ghostBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ghostBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bss.orange.Ghost.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ghost");
    }
  }

  private static final class ghostFileDescriptorSupplier
      extends ghostBaseDescriptorSupplier {
    ghostFileDescriptorSupplier() {}
  }

  private static final class ghostMethodDescriptorSupplier
      extends ghostBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ghostMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ghostGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ghostFileDescriptorSupplier())
              .addMethod(getDiskcheckMethod())
              .addMethod(getCheckdefinitionMethod())
              .addMethod(getCutoverMethod())
              .addMethod(getDryrunMethod())
              .addMethod(getExecuteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
