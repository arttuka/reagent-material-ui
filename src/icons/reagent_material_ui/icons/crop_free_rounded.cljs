(ns reagent-material-ui.icons.crop-free-rounded
  "Imports @material-ui/icons/CropFreeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-free-rounded (create-svg-icon (e "path" #js {"d" "M3 5v3c0 .55.45 1 1 1s1-.45 1-1V5h3c.55 0 1-.45 1-1s-.45-1-1-1H5c-1.1 0-2 .9-2 2zm1 10c-.55 0-1 .45-1 1v3c0 1.1.9 2 2 2h3c.55 0 1-.45 1-1s-.45-1-1-1H5v-3c0-.55-.45-1-1-1zm15 4h-3c-.55 0-1 .45-1 1s.45 1 1 1h3c1.1 0 2-.9 2-2v-3c0-.55-.45-1-1-1s-1 .45-1 1v3zm0-16h-3c-.55 0-1 .45-1 1s.45 1 1 1h3v3c0 .55.45 1 1 1s1-.45 1-1V5c0-1.1-.9-2-2-2z"})
                                        "CropFreeRounded"))
