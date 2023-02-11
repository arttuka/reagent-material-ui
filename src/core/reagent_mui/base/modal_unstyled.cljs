(ns reagent-mui.base.modal-unstyled
  "Imports @mui/base/ModalUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/modal-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/ModalUnstyled" :as MuiModalUnstyled]))

(def modal-unstyled (r/adapt-react-class (.-default MuiModalUnstyled)))
