(ns reagent-material-ui.icons.looks-6-rounded
  "Imports @material-ui/icons/Looks6Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def looks-6-rounded (create-svg-icon (e "path" #js {"d" "M11 15h2v-2h-2v2zm8-12H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-5 6h-3v2h2c1.1 0 2 .9 2 2v2c0 1.11-.9 2-2 2h-2c-1.1 0-2-.89-2-2V9c0-1.1.9-2 2-2h3c.55 0 1 .45 1 1s-.45 1-1 1z"})
                                      "Looks6Rounded"))
