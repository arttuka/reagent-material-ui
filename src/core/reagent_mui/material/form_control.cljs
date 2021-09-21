(ns reagent-mui.material.form-control
  "Imports @mui/material/FormControl as a Reagent component.
   Original documentation is at https://mui.com/api/form-control/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/FormControl" :as MuiFormControl]))

(def form-control (adapt-react-class (.-default MuiFormControl) "mui-form-control"))
