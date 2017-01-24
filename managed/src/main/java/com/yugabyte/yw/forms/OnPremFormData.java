// Copyright (c) Yugabyte, Inc.

package com.yugabyte.yw.forms;

import java.util.UUID;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.data.validation.Constraints;

/**
 * This class describes the fields we need to setup an on-prem deployment.
 */
public class OnPremFormData {
  @Constraints.Required()
  public IdData identification;

  public CloudData description;

  public AccessData access;

  // Storage classes
  static public class IdData {
    public UUID uuid;
    public String name;
    public String type;
  }

  static public class CloudData {
    public List<RegionData> regions;
    public List<InstanceTypeData> instance_types;
  }

  static public class RegionData {
    public String code;
    public List<ZoneData> zones;
  }

  static public class ZoneData {
    public String code;
    public List<NodeData> nodes;
  }

  static public class NodeData {
    public String ip;
    public String instance_type_code;
  }

  static public class InstanceTypeData {
    public String code;
  }

  // TODO: placeholder
  static public class AccessData {
  }
}
