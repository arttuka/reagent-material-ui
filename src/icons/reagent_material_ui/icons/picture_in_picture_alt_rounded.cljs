(ns reagent-material-ui.icons.picture-in-picture-alt-rounded
  "Imports @material-ui/icons/PictureInPictureAltRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def picture-in-picture-alt-rounded (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.1 0-2 .88-2 1.98V18c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V5.98C22 4.88 21.1 4 20 4zm-2 13h-6c-.55 0-1-.45-1-1v-4c0-.55.45-1 1-1h6c.55 0 1 .45 1 1v4c0 .55-.45 1-1 1z"})
                                                     "PictureInPictureAltRounded"))
