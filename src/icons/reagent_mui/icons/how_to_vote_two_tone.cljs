(ns reagent-mui.icons.how-to-vote-two-tone
  "Imports @mui/icons-material/HowToVoteTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def how-to-vote-two-tone (create-svg-icon [(e "path" #js {"d" "M5 19h14v1H5z", "opacity" ".3"}) (e "path" #js {"d" "M18 13h-.68l-2 2h1.91L19 17H5l1.78-2h2.05l-2-2H6l-3 3v4c0 1.1.89 2 1.99 2H19c1.1 0 2-.89 2-2v-4l-3-3zm1 7H5v-1h14v1z"}) (e "path" #js {"d" "M12.048 12.905 8.505 9.362l4.95-4.95 3.543 3.543z", "opacity" ".3"}) (e "path" #js {"d" "M19.11 7.25 14.16 2.3c-.38-.4-1.01-.4-1.4-.01L6.39 8.66c-.39.39-.39 1.02 0 1.41l4.95 4.95c.39.39 1.02.39 1.41 0l6.36-6.36c.39-.39.39-1.02 0-1.41zm-7.06 5.65L8.51 9.36l4.95-4.95L17 7.95l-4.95 4.95z"})]
                                           "HowToVoteTwoTone"))
