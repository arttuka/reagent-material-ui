(ns reagent-mui.icons.playlist-add-check-circle-rounded
  "Imports @mui/icons-material/PlaylistAddCheckCircleRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def playlist-add-check-circle-rounded (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zM7 8c0-.55.45-1 1-1h5c.55 0 1 .45 1 1s-.45 1-1 1H8c-.55 0-1-.45-1-1zm0 3c0-.55.45-1 1-1h5c.55 0 1 .45 1 1s-.45 1-1 1H8c-.55 0-1-.45-1-1zm3 3c0 .55-.45 1-1 1H8c-.55 0-1-.45-1-1s.45-1 1-1h1c.55 0 1 .45 1 1zm8.29.12-3.54 3.54c-.39.39-1.02.39-1.41 0l-1.41-1.41a.9959.9959 0 0 1 0-1.41c.39-.39 1.02-.39 1.41 0l.71.71 2.83-2.83c.39-.39 1.02-.39 1.41 0 .39.38.39 1.01 0 1.4z"})
                                                        "PlaylistAddCheckCircleRounded"))
