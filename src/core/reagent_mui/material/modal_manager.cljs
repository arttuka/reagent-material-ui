(ns reagent-mui.material.modal-manager
  "Imports @mui/material/Modal/ModalManager as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/modal-manager/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Modal" :as MuiModal]))

(def modal-manager (adapt-react-class MuiModal/ModalManager "mui-modal-manager"))
