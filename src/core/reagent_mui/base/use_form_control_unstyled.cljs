(ns reagent-mui.base.use-form-control-unstyled
  "Imports @mui/base/FormControlUnstyled/useFormControlUnstyled as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/base/api/use-form-control-unstyled/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/FormControlUnstyled" :as MuiFormControlUnstyled]))

(def use-form-control-unstyled (wrap-js-function MuiFormControlUnstyled/useFormControlUnstyled))
