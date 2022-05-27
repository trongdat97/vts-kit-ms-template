package ${package}.error;

import com.viettel.vtskit.common.exception.IExceptionHandler;
import com.viettel.vtskit.common.rest.ErrorDTO;
import com.viettel.vtskit.logs.AppLogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class ExceptionHandler implements IExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandler.class);

    @Override
    public ResponseEntity<ErrorDTO> handleAccessDeniedException(AccessDeniedException ex) {
        AppLogService.error(LOGGER, ex);
        return IExceptionHandler.super.handleAccessDeniedException(ex);
    }

    @Override
    public ResponseEntity<ErrorDTO> handleAuthenticationException(AuthenticationException ex) {
        AppLogService.error(LOGGER, ex);
        return IExceptionHandler.super.handleAuthenticationException(ex);
    }

    @Override
    public ResponseEntity<ErrorDTO> handleCommonException(Exception ex) {
        AppLogService.error(LOGGER, ex);
        return IExceptionHandler.super.handleCommonException(ex);
    }

    @Override
    public ResponseEntity<ErrorDTO> handleMethodArgumentException(MethodArgumentNotValidException ex) {
        AppLogService.error(LOGGER, ex);
        return IExceptionHandler.super.handleMethodArgumentException(ex);
    }

    @Override
    public ResponseEntity<ErrorDTO> handleConstraintViolationException(ConstraintViolationException ex) {
        AppLogService.error(LOGGER, ex);
        return IExceptionHandler.super.handleConstraintViolationException(ex);
    }

    @Override
    public ResponseEntity<ErrorDTO> handleMissingPartException(Exception ex) {
        AppLogService.error(LOGGER, ex);
        return IExceptionHandler.super.handleMissingPartException(ex);
    }
}
