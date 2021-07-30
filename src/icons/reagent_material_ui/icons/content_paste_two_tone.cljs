(ns reagent-material-ui.icons.content-paste-two-tone
  "Imports @material-ui/icons/ContentPasteTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def content-paste-two-tone (create-svg-icon [(e "path" #js {"d" "M17 7H7V4H5v16h14V4h-2z", "opacity" ".3"}) (e "path" #js {"d" "M19 2h-4.18C14.4.84 13.3 0 12 0S9.6.84 9.18 2H5c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-7 0c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1zm7 18H5V4h2v3h10V4h2v16z"})]
                                             "ContentPasteTwoTone"))
