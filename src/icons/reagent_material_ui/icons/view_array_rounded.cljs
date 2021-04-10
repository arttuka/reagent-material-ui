(ns reagent-material-ui.icons.view-array-rounded
  "Imports @material-ui/icons/ViewArrayRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-array-rounded (create-svg-icon (e "path" #js {"d" "M5 18h1c.55 0 1-.45 1-1V6c0-.55-.45-1-1-1H5c-.55 0-1 .45-1 1v11c0 .55.45 1 1 1zM18 6v11c0 .55.45 1 1 1h1c.55 0 1-.45 1-1V6c0-.55-.45-1-1-1h-1c-.55 0-1 .45-1 1zM9 18h7c.55 0 1-.45 1-1V6c0-.55-.45-1-1-1H9c-.55 0-1 .45-1 1v11c0 .55.45 1 1 1z"})
                                         "ViewArrayRounded"))
