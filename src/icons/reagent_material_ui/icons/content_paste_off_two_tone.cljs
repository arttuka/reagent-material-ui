(ns reagent-material-ui.icons.content-paste-off-two-tone
  "Imports @material-ui/icons/ContentPasteOffTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def content-paste-off-two-tone (create-svg-icon [(e "path" #js {"d" "M10.83 8H17V5h2v11.17L10.83 8zM5 19V7.83L16.17 19H5z", "opacity" ".3"}) (e "path" #js {"d" "M21.19 21.19 2.81 2.81 1.39 4.22 3 5.83V19c0 1.1.9 2 2 2h13.17l1.61 1.61 1.41-1.42zM5 19V7.83L16.17 19H5zM17 8V5h2v11.17l2 2V5c0-1.1-.9-2-2-2h-4.18C14.4 1.84 13.3 1 12 1s-2.4.84-2.82 2H5.83l5 5H17zm-5-5c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1z"})]
                                                 "ContentPasteOffTwoTone"))
