(ns reagent-mui.material.modal-manager
  "Imports @mui/material/Modal/ModalManager as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/modal-manager/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Modal" :as MuiModal]))

(def modal-manager (r/adapt-react-class MuiModal/ModalManager))
