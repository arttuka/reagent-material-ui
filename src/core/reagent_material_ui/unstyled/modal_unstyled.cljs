(ns reagent-material-ui.unstyled.modal-unstyled
  "Imports @material-ui/unstyled/ModalUnstyled as a Reagent component.
   Original documentation is at https://material-ui.com/api/modal-unstyled/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/unstyled/ModalUnstyled" :as MuiModalUnstyled]))

(def modal-unstyled (adapt-react-class (.-default MuiModalUnstyled) "mui-modal-unstyled"))
