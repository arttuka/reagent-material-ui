(ns reagent-material-ui.icons.wb-twilight-outlined
  "Imports @material-ui/icons/WbTwilightOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def wb-twilight-outlined (create-svg-icon (e "path" #js {"d" "m16.9542 8.6615 2.1205-2.122 1.4147 1.4137-2.1205 2.122zM2 18h20v2H2zm9-14h2v3h-2zM3.5426 7.9248l1.4142-1.4142L7.078 8.632l-1.4142 1.4142zM5 16h14c0-3.87-3.13-7-7-7s-7 3.13-7 7z"})
                                           "WbTwilightOutlined"))
