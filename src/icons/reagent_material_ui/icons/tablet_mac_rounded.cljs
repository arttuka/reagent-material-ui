(ns reagent-material-ui.icons.tablet-mac-rounded
  "Imports @material-ui/icons/TabletMacRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def tablet-mac-rounded (create-svg-icon (e "path" #js {"d" "M19 1H5c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm-7 19.5c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm7-4.5H5V6h14v10z"})
                                         "TabletMacRounded"))
