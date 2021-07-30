(ns reagent-material-ui.icons.window-two-tone
  "Imports @material-ui/icons/WindowTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def window-two-tone (create-svg-icon [(e "path" #js {"d" "M4 4h7v7H4zm0 9h7v7H4zm9 0h7v7h-7zm0-9h7v7h-7z", "opacity" ".3"}) (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-9 18H4v-7h7v7zm0-9H4V4h7v7zm9 9h-7v-7h7v7zm0-9h-7V4h7v7z"})]
                                      "WindowTwoTone"))
