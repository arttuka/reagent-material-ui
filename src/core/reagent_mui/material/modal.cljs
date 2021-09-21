(ns reagent-mui.material.modal
  "Imports @mui/material/Modal as a Reagent component.
   Original documentation is at https://mui.com/api/modal/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Modal" :as MuiModal]))

(def modal (adapt-react-class (.-default MuiModal) "mui-modal"))
