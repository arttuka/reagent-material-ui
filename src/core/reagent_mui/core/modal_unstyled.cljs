(ns reagent-mui.core.modal-unstyled
  "Imports @mui/core/ModalUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/modal-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/core/ModalUnstyled" :as MuiModalUnstyled]))

(def modal-unstyled (adapt-react-class (.-default MuiModalUnstyled) "mui-modal-unstyled"))
