(ns reagent-material-ui.icons.three-k-two-tone
  "Imports @material-ui/icons/ThreeKTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def three-k-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 19h14V5H5v14zm8-10h1.5v2.25L16.25 9H18l-2.25 3L18 15h-1.75l-1.75-2.25V15H13V9zm-6.5 4.5h3v-1h-2v-1h2v-1h-3V9H10c.55 0 1 .45 1 1v4c0 .55-.45 1-1 1H6.5v-1.5z", "opacity" ".3"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"}) (e "path" #js {"d" "M11 14v-4c0-.55-.45-1-1-1H6.5v1.5h3v1h-2v1h2v1h-3V15H10c.55 0 1-.45 1-1zm3.5-1.25L16.25 15H18l-2.25-3L18 9h-1.75l-1.75 2.25V9H13v6h1.5z"}))
                                       "ThreeKTwoTone"))
