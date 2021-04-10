(ns reagent-material-ui.icons.view-stream-rounded
  "Imports @material-ui/icons/ViewStreamRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-stream-rounded (create-svg-icon (e "path" #js {"d" "M5 18h15c.55 0 1-.45 1-1v-4c0-.55-.45-1-1-1H5c-.55 0-1 .45-1 1v4c0 .55.45 1 1 1zM4 6v4c0 .55.45 1 1 1h15c.55 0 1-.45 1-1V6c0-.55-.45-1-1-1H5c-.55 0-1 .45-1 1z"})
                                          "ViewStreamRounded"))
