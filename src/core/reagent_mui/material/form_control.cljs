(ns reagent-mui.material.form-control
  "Imports @mui/material/FormControl as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/form-control/ ."
  (:require [reagent.core :as r]
            ["@mui/material/FormControl" :as MuiFormControl]))

(def form-control (r/adapt-react-class (.-default MuiFormControl)))
