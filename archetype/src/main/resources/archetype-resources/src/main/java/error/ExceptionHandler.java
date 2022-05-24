package ${package}.error;

import com.viettel.vtskit.common.exception.AbstractExceptionHandler;
import com.viettel.vtskit.common.rest.ErrorDTO;
import com.viettel.vtskit.logs.AppLogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class ExceptionHandler extends AbstractExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandler.class);

    @Override
    protected ResponseEntity<ErrorDTO> handleAccessDeniedException() {
        // TODO: Override Here
        return super.handleAccessDeniedException();
    }

    @Override
    protected ResponseEntity<ErrorDTO> handleCommonException(Exception ex) {
        AppLogService.error(LOGGER, ex);
        return super.handleCommonException(ex);
    }

    @Override
    protected ResponseEntity<ErrorDTO> handleMethodArgumentException(MethodArgumentNotValidException ex) {
        AppLogService.error(LOGGER, ex);
        return super.handleMethodArgumentException(ex);
    }

    @Override
    protected ResponseEntity<ErrorDTO> handleConstraintViolationException(ConstraintViolationException ex) {
        AppLogService.error(LOGGER, ex);
        return super.handleConstraintViolationException(ex);
    }

    @Override
    protected ResponseEntity<ErrorDTO> handleMissingPartException(Exception ex) {
        AppLogService.error(LOGGER, ex);
        return super.handleMissingPartException(ex);
    }
}
