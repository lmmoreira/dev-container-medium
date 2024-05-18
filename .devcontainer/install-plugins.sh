#!/bin/bash

IDE_BIN_FOLDER="/.jbdevcontainer/.cache/JetBrains/RemoteDev/dist/737b06544d6b5_ideaIU-241.17011.2/bin"

# List of plugins to install
PLUGINS=(
  "com.github.copilot"
  "com.dubreuia.tool"
  "google-java-format"
)

for PLUGIN in "${PLUGINS[@]}"; do
  #"$IDE_BIN_FOLDER/idea.sh" installPlugin "$PLUGIN"
done

