(ns reagent-material-ui.icons.h-mobiledata-sharp
  "Imports @material-ui/icons/HMobiledataSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def h-mobiledata-sharp (create-svg-icon (e "path" #js {"d" "M15 11H9V7H7v10h2v-4h6v4h2V7h-2v4z"})
                                         "HMobiledataSharp"))
