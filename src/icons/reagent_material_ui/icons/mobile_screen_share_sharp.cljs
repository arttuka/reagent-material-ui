(ns reagent-material-ui.icons.mobile-screen-share-sharp
  "Imports @material-ui/icons/MobileScreenShareSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def mobile-screen-share-sharp (create-svg-icon (e "path" #js {"d" "M5.01 1v22H19V1H5.01zM17 19H7V5h10v14zm-4.2-5.76v1.75L16 12l-3.2-2.98v1.7c-3.11.43-4.35 2.56-4.8 4.7 1.11-1.5 2.58-2.18 4.8-2.18z"})
                                                "MobileScreenShareSharp"))
