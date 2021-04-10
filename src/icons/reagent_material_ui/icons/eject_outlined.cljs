(ns reagent-material-ui.icons.eject-outlined
  "Imports @material-ui/icons/EjectOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def eject-outlined (create-svg-icon (e "path" #js {"d" "M5 17h14v2H5zm7-12L5.33 15h13.34L12 5zm0 3.6l2.93 4.4H9.07L12 8.6z"})
                                     "EjectOutlined"))
