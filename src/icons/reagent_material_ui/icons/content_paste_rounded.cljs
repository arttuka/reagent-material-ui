(ns reagent-material-ui.icons.content-paste-rounded
  "Imports @material-ui/icons/ContentPasteRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def content-paste-rounded (create-svg-icon (e "path" #js {"d" "M19 3h-4.18C14.4 1.84 13.3 1 12 1s-2.4.84-2.82 2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-7 0c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1zm7 16H5V5h2v1c0 1.1.9 2 2 2h6c1.1 0 2-.9 2-2V5h2v14z"})
                                            "ContentPasteRounded"))
