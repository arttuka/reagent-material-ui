(ns reagent-material-ui.icons.ios-share-sharp
  "Imports @material-ui/icons/IosShareSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def ios-share-sharp (create-svg-icon [(e "path" #js {"d" "M20 8h-5v2h3v11H6V10h3V8H4v15h16z"}) (e "path" #js {"d" "M11 16h2V5h3l-4-4-4 4h3z"})]
                                      "IosShareSharp"))
