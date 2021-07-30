(ns reagent-material-ui.icons.settings-input-svideo-rounded
  "Imports @material-ui/icons/SettingsInputSvideoRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def settings-input-svideo-rounded (create-svg-icon [(e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"}) (e "circle" #js {"cx" "7.5", "cy" "11.5", "r" "1.5"}) (e "circle" #js {"cx" "16.5", "cy" "11.5", "r" "1.5"}) (e "circle" #js {"cx" "9", "cy" "16", "r" "1.5"}) (e "circle" #js {"cx" "15", "cy" "16", "r" "1.5"}) (e "path" #js {"d" "M15 7.5c0-.83-.67-1.5-1.5-1.5h-3C9.67 6 9 6.67 9 7.5S9.67 9 10.5 9h3c.83 0 1.5-.67 1.5-1.5z"})]
                                                    "SettingsInputSvideoRounded"))
