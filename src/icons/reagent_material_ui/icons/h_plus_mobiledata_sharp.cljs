(ns reagent-material-ui.icons.h-plus-mobiledata-sharp
  "Imports @material-ui/icons/HPlusMobiledataSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def h-plus-mobiledata-sharp (create-svg-icon (e "path" #js {"d" "M12 11H6V7H4v10h2v-4h6v4h2V7h-2v4zm10 0h-2V9h-2v2h-2v2h2v2h2v-2h2v-2z"})
                                              "HPlusMobiledataSharp"))
