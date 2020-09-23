(ns reagent-material-ui.icons.border-vertical-two-tone
  "Imports @material-ui/icons/BorderVerticalTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def border-vertical-two-tone (create-svg-icon (e "path" #js {"d" "M7 3h2v2H7zm0 8h2v2H7zm0 8h2v2H7zm-4 0h2v2H3zM3 3h2v2H3zm0 8h2v2H3zm16-8h2v2h-2zM3 7h2v2H3zm8-4h2v18h-2zM3 15h2v2H3zm12-4h2v2h-2zm4 4h2v2h-2zm0-4h2v2h-2zm0-4h2v2h-2zm0 12h2v2h-2zm-4 0h2v2h-2zm0-16h2v2h-2z"})
                                               "BorderVerticalTwoTone"))
