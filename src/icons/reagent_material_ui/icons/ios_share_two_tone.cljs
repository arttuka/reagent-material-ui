(ns reagent-material-ui.icons.ios-share-two-tone
  "Imports @material-ui/icons/IosShareTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def ios-share-two-tone (create-svg-icon [(e "path" #js {"d" "M18 8h-3v2h3v11H6V10h3V8H6c-1.11 0-2 .89-2 2v11c0 1.1.89 2 2 2h12c1.1 0 2-.9 2-2V10c0-1.11-.9-2-2-2z"}) (e "path" #js {"d" "M11 16h2V5h3l-4-4-4 4h3z"})]
                                         "IosShareTwoTone"))
