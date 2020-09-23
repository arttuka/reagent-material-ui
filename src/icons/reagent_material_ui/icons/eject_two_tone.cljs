(ns reagent-material-ui.icons.eject-two-tone
  "Imports @material-ui/icons/EjectTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def eject-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 8.6L9.07 13h5.86z", "opacity" ".3"}) (e "path" #js {"d" "M5 17h14v2H5zm7-12L5.33 15h13.34L12 5zm0 3.6l2.93 4.4H9.07L12 8.6z"}))
                                     "EjectTwoTone"))
