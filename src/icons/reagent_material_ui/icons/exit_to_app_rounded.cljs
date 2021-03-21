(ns reagent-material-ui.icons.exit-to-app-rounded
  "Imports @material-ui/icons/ExitToAppRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def exit-to-app-rounded (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.11 0-2 .9-2 2v3c0 .55.45 1 1 1s1-.45 1-1V5h14v14H5v-3c0-.55-.45-1-1-1s-1 .45-1 1v3c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-7.15 12.15l2.79-2.79c.2-.2.2-.51 0-.71l-2.79-2.79c-.31-.32-.85-.1-.85.35V11H4c-.55 0-1 .45-1 1s.45 1 1 1h7v1.79c0 .45.54.67.85.36z"})
                                          "ExitToAppRounded"))
