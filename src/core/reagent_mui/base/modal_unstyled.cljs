(ns reagent-mui.base.modal-unstyled
  "Imports @mui/base/ModalUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/modal-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/ModalUnstyled" :as MuiModalUnstyled]))

(def modal-unstyled (adapt-react-class (.-default MuiModalUnstyled) "mui-modal-unstyled"))
