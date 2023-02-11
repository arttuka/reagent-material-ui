(ns reagent-mui.material.modal
  "Imports @mui/material/Modal as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/modal/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Modal" :as MuiModal]))

(def modal (r/adapt-react-class (.-default MuiModal)))
