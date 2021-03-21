(ns reagent-material-ui.icons.dvr-rounded
  "Imports @material-ui/icons/DvrRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def dvr-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 3H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h4v1c0 .55.45 1 1 1h6c.55 0 1-.45 1-1v-1h4c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 14H4V5h16v12zm-3-9h-7c-.55 0-1 .45-1 1s.45 1 1 1h7c.55 0 1-.45 1-1s-.45-1-1-1zm0 4h-7c-.55 0-1 .45-1 1s.45 1 1 1h7c.55 0 1-.45 1-1s-.45-1-1-1z"}) (e "circle" #js {"cy" "9", "r" "1", "cx" "7"}) (e "circle" #js {"cy" "13", "r" "1", "cx" "7"}))
                                  "DvrRounded"))
