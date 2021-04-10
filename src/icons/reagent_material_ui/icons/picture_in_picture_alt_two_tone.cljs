(ns reagent-material-ui.icons.picture-in-picture-alt-two-tone
  "Imports @material-ui/icons/PictureInPictureAltTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def picture-in-picture-alt-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 11h-8v6h8v-6zm-2 4h-4v-2h4v2zm4-12H3c-1.1 0-2 .88-2 1.98V19c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V4.98C23 3.88 22.1 3 21 3zm0 16.02H3V4.97h18v14.05z"}) (e "path" #js {"d" "M13 13h4v2h-4z", "opacity" ".3"}))
                                                      "PictureInPictureAltTwoTone"))
