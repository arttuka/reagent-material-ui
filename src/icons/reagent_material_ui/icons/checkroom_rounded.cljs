(ns reagent-material-ui.icons.checkroom-rounded
  "Imports @material-ui/icons/CheckroomRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def checkroom-rounded (create-svg-icon (e "path" #js {"d" "M21.6 18.2 13 11.75v-.91c1.65-.49 2.8-2.17 2.43-4.05-.26-1.31-1.3-2.4-2.61-2.7-1.76-.4-3.37.53-4.02 1.98-.3.67.18 1.43.91 1.43.39 0 .75-.22.9-.57.23-.55.76-.93 1.39-.93.83 0 1.5.67 1.5 1.5 0 .84-.69 1.52-1.53 1.5-.54-.01-.97.45-.97.99v1.76L2.4 18.2c-.77.58-.36 1.8.6 1.8h18c.96 0 1.37-1.22.6-1.8zM6 18l6-4.5 6 4.5H6z"})
                                        "CheckroomRounded"))
