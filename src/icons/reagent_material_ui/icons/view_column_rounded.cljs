(ns reagent-material-ui.icons.view-column-rounded
  "Imports @material-ui/icons/ViewColumnRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-column-rounded (create-svg-icon (e "path" #js {"d" "M14.67 6v12c0 .55-.45 1-1 1h-3.33c-.55 0-1-.45-1-1V6c0-.55.45-1 1-1h3.33c.55 0 1 .45 1 1zm2 13H20c.55 0 1-.45 1-1V6c0-.55-.45-1-1-1h-3.33c-.55 0-1 .45-1 1v12c0 .55.44 1 1 1zm-8.34-1V6c0-.55-.45-1-1-1H4c-.55 0-1 .45-1 1v12c0 .55.45 1 1 1h3.33c.56 0 1-.45 1-1z"})
                                          "ViewColumnRounded"))
