(ns reagent-material-ui.core.use-form-control
  "Imports @material-ui/core/FormControl/useFormControl as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://material-ui.com/api/use-form-control/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/core/FormControl" :as MuiFormControl]))

(def use-form-control (wrap-js-function (.-useFormControl MuiFormControl)))
