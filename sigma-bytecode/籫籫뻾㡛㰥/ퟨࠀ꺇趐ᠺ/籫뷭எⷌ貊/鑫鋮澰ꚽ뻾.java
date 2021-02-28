public final class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u946b\u92ee\u6fb0\ua6bd\ubefe {
    public void \u946b\u92ee\u6fb0\ua6bd\ubefe() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u946b\u92ee\u6fb0\ua6bd\ubefe)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.authlib.GameProfile \uceb8\u98a4\u965f\u5140\ud158\u88c5(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
        var_3_66 : String
        var_4_68 : UUID
        var_5_BB : GameProfile
        var_6_E0 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_7_EC : Iterator<String>
        var_8_102 : String
        var_9_10D : \ud158\u8308\u76bc\u0a06\ud36e
        var_10_116 : int
        var_11_129 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_12_13B : String
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_66 = aconstnull:String()
        var_4_68 = aconstnull:UUID()
        
        if (invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(20897), ldc:int(-21410))), ldc:int(8))) {
            var_3_66 = invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(-26800), ldc:int(26798))))
        }
        
        if (invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\ufcaf\u3a62\u8308\u4179\u7ce1\u97b7, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(12819), ldc:int(18561))))) {
            var_4_68 = invokevirtual:UUID(\uc31c\uc87f\uc246\u3776\ub7dc::\ud171\u16f6\ub7dc\uc238\u7ce1\u4f52, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), xor:int(ldc:int(-32352), ldc:int(-32351))))
        }
        
        try {
            var_5_BB = initobject:GameProfile(GameProfile::<init>, var_4_68:UUID, var_3_66:String)
            
            if (invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(9858), ldc:int(10))), ldc:int(10))) {
                var_6_E0 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), xor:int(ldc:int(769), ldc:int(771))))
                var_7_EC = invokeinterface:Iterator<String>(Set<String>::iterator, invokevirtual:Set<String>(\uc31c\uc87f\uc246\u3776\ub7dc::\ua068\u92ff\u873d\u9033\u99f7\ubefe, var_6_E0:\uc31c\uc87f\uc246\u3776\ub7dc))
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_7_EC:Iterator<String>)) {
                    var_8_102 = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_7_EC:Iterator<String>))
                    var_9_10D = invokevirtual:\ud158\u8308\u76bc\u0a06\ud36e(\uc31c\uc87f\uc246\u3776\ub7dc::\uff55\u40a9\u8753\u4975\u120d\u4daf, var_6_E0:\uc31c\uc87f\uc246\u3776\ub7dc, var_8_102:String, ldc:int(10))
                    var_10_116 = and:int(ldc:int(5632), ldc:int(-5633))
                    
                    while (cmplt:boolean(var_10_116:int, invokevirtual:int(\ud158\u8308\u76bc\u0a06\ud36e::size, var_9_10D:\ud158\u8308\u76bc\u0a06\ud36e))) {
                        var_11_129 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ud158\u8308\u76bc\u0a06\ud36e::\u93a2\uc84e\u3e2a\u8d98\u51fa\u4492, var_9_10D:\ud158\u8308\u76bc\u0a06\ud36e, var_10_116:int)
                        var_12_13B = invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, var_11_129:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(18459), ldc:int(5191))))
                        
                        if (invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, var_11_129:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(13317), ldc:int(2318))), ldc:int(8))) {
                            invokevirtual:boolean(PropertyMap::put, invokevirtual:PropertyMap(GameProfile::getProperties, var_5_BB:GameProfile), var_8_102:String[expected:Object], initobject:Property(Property::<init>, var_8_102:String, var_12_13B:String, invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, var_11_129:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(12046), ldc:int(4))))))
                        }
                        else {
                            invokevirtual:boolean(PropertyMap::put, invokevirtual:PropertyMap(GameProfile::getProperties, var_5_BB:GameProfile), var_8_102:String[expected:Object], initobject:Property(Property::<init>, var_8_102:String, var_12_13B:String))
                        }
                        
                        inc:int(var_10_116, ldc:int(1))
                    }
                }
            }
            
            return:GameProfile(var_5_BB:GameProfile)
        }
        catch (java.lang.Throwable var_5_1AD) {
            return:GameProfile(aconstnull:GameProfile())
        }
    }
    
    public static \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u839e\ud171\uae5d\u8640\u6d99\u1833(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0, com.mojang.authlib.GameProfile p1) {
        var_2_188 : int
        var_4_105 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_5_113 : Iterator<String>
        var_6_162 : String
        var_7_16B : \ud158\u8308\u76bc\u0a06\ud36e
        var_8_17B : Iterator
        var_9_1C2 : Property
        var_10_1CB : \uc31c\uc87f\uc246\u3776\ub7dc
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_188 = and:int(ldc:int(2113774337), ldc:int(-50486325))
            
            if (logicalnot:boolean(invokestatic:boolean(\uc84e\u40a9\uc9f6\u4492\u3776\u4c04::\u56bd\u0800\ub171\uc31c\u99f7\uc9f6, invokevirtual:String(GameProfile::getName, p1:GameProfile)))) {
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(12617), ldc:int(-29054))), invokevirtual:String(GameProfile::getName, p1:GameProfile))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_2_188:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_188 = and:int(var_2_188:int, ldc:int(852832734))
                    goto(Label_0177)
                }
                
                if (cmpne:boolean(and:int(var_2_188:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_188 = and:int(var_2_188:int, ldc:int(-891047669))
                }
                else {
                    var_2_188 = and:int(var_2_188:int, ldc:int(-572674302))
                    
                    if (cmpne:boolean(invokevirtual:UUID(GameProfile::getId, p1:GameProfile), aconstnull:UUID())) {
                        invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\ufcaf\u7ce1\ubff1\u7d52\ud12e\u4975, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), xor:int(ldc:int(-32716), ldc:int(-32715))), invokevirtual:UUID(GameProfile::getId, p1:GameProfile))
                    }
                }
                
                Label_0148:
                
                if (cmpne:boolean(and:int(var_2_188:int, ldc:int(8192)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_188:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_188 = and:int(var_2_188:int, ldc:int(-537401508))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(PropertyMap::isEmpty, invokevirtual:PropertyMap(GameProfile::getProperties, p1:GameProfile)))) {
                        var_4_105 = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
                        var_5_113 = invokeinterface:Iterator<String>(Set<String>::iterator, invokevirtual:Set(PropertyMap::keySet, invokevirtual:PropertyMap(GameProfile::getProperties, p1:GameProfile)))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_2_188:int, ldc:int(262144)), ldc:int(0))) {
                                var_2_188 = and:int(var_2_188:int, ldc:int(-539103300))
                                
                                if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_113:Iterator<String>)) {
                                    var_6_162 = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_5_113:Iterator<String>))
                                    var_7_16B = initobject:\ud158\u8308\u76bc\u0a06\ud36e(\ud158\u8308\u76bc\u0a06\ud36e::<init>)
                                    var_8_17B = invokeinterface:Iterator(Collection::iterator, invokevirtual:Collection(PropertyMap::get, invokevirtual:PropertyMap(GameProfile::getProperties, p1:GameProfile), var_6_162:String[expected:Object]))
                                    
                                    loop {
                                        if (cmpne:boolean(and:int(var_2_188:int, ldc:int(1048576)), ldc:int(0))) {
                                            var_2_188 = and:int(var_2_188:int, ldc:int(1023391516))
                                            
                                            if (invokeinterface:boolean(Iterator::hasNext, var_8_17B:Iterator)) {
                                                var_9_1C2 = checkcast:Property(com.mojang.authlib.properties.Property.class, invokeinterface:Property(Iterator<Property>::next, var_8_17B:Iterator<Property>))
                                                var_10_1CB = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
                                                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, var_10_1CB:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(35), ldc:int(15367))), invokevirtual:String(Property::getValue, var_9_1C2:Property))
                                                
                                                if (invokevirtual:boolean(Property::hasSignature, var_9_1C2:Property)) {
                                                    invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, var_10_1CB:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(4356), ldc:int(10758))), invokevirtual:String(Property::getSignature, var_9_1C2:Property))
                                                }
                                                
                                                var_2_188 = and:int(var_2_188:int, ldc:int(1073084321))
                                                invokevirtual:boolean(AbstractList<\uc31c\uc87f\uc246\u3776\ub7dc>::add, var_7_16B:AbstractList<\uc31c\uc87f\uc246\u3776\ub7dc>, var_10_1CB:\uc31c\uc87f\uc246\u3776\ub7dc)
                                                loopcontinue()
                                            }
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_188:int, ldc:int(32)), ldc:int(0))) {
                                            looporswitchbreak()
                                        }
                                        
                                        var_2_188 = and:int(var_2_188:int, ldc:int(-2069908233))
                                    }
                                    
                                    var_2_188 = and:int(var_2_188:int, ldc:int(1071638279))
                                    invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_4_105:\uc31c\uc87f\uc246\u3776\ub7dc, var_6_162:String, var_7_16B:\ud158\u8308\u76bc\u0a06\ud36e[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_2_188:int, ldc:int(8388608)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_2_188 = and:int(var_2_188:int, ldc:int(-2133082207))
                        }
                        
                        var_2_188 = and:int(var_2_188:int, ldc:int(-19529951))
                        invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), xor:int(ldc:int(18691), ldc:int(18689))), var_4_105:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
                    }
                }
                
                Label_0177:
                
                if (cmpeq:boolean(and:int(var_2_188:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0148)
                }
                
                if (cmpne:boolean(and:int(var_2_188:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:\uc31c\uc87f\uc246\u3776\ub7dc(p0:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u3a62\u8413\u4f4a\ub83f\uc910\u3d64(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab p1, boolean p2) {
        var_3_26D : int
        var_5_24D : \uc31c\uc87f\uc246\u3776\ub7dc
        var_6_253 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_7_25F : Iterator<String>
        var_8_2A4 : String
        var_5_2EA : \ud158\u8308\u76bc\u0a06\ud36e
        var_6_2F0 : \ud158\u8308\u76bc\u0a06\ud36e
        var_3_37E : int
        var_7_307 : int
        var_8_340 : \u93a2\u97b7\u647c\ud36e\u64ab
        var_9_349 : int
        var_10_352 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_26D = and:int(ldc:int(-461509233), ldc:int(754233196))
        
        if (cmpeq:boolean(p0:\u93a2\u97b7\u647c\ud36e\u64ab, p1:\u93a2\u97b7\u647c\ud36e\u64ab)) {
            return:boolean(xor:int[expected:boolean](ldc:int(8368), ldc:int(8369)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0449)
            }
            
            if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(16)), ldc:int(0))) {
                var_3_26D = and:int(var_3_26D:int, ldc:int(586366138))
                goto(Label_0378)
            }
            
            if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0307)
            }
            
            if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(262144)), ldc:int(0))) {
                var_3_26D = and:int(var_3_26D:int, ldc:int(979510291))
                goto(Label_0229)
            }
            
            if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(2048)), ldc:int(0))) {
                var_3_26D = and:int(var_3_26D:int, ldc:int(-1533739574))
                
                if (cmpeq:boolean(p0:\u93a2\u97b7\u647c\ud36e\u64ab, aconstnull:\u93a2\u97b7\u647c\ud36e\u64ab())) {
                    return:boolean(and:int[expected:boolean](ldc:int(26425), ldc:int(3)))
                }
            }
            
            Label_0161:
            
            if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0449)
            }
            
            if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(536870912)), ldc:int(0))) {
                var_3_26D = and:int(var_3_26D:int, ldc:int(-302070148))
                goto(Label_0378)
            }
            
            if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(536870912)), ldc:int(0))) {
                var_3_26D = and:int(var_3_26D:int, ldc:int(494694894))
                goto(Label_0307)
            }
            
            if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(256)), ldc:int(0))) {
                var_3_26D = and:int(var_3_26D:int, ldc:int(1063922871))
            }
            else {
                if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(32768)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_26D = and:int(var_3_26D:int, ldc:int(-25764001))
                
                if (cmpeq:boolean(p1:\u93a2\u97b7\u647c\ud36e\u64ab, aconstnull:\u93a2\u97b7\u647c\ud36e\u64ab())) {
                    return:boolean(and:int[expected:boolean](ldc:int(15104), ldc:int(-15121)))
                }
            }
            
            Label_0229:
            
            if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0449)
            }
            
            if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(16)), ldc:int(0))) {
                var_3_26D = and:int(var_3_26D:int, ldc:int(1675516239))
                goto(Label_0378)
            }
            
            if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(1048576)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(256)), ldc:int(0))) {
                    var_3_26D = and:int(var_3_26D:int, ldc:int(-1129782257))
                    goto(Label_0161)
                }
                
                if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_26D = and:int(var_3_26D:int, ldc:int(646035769))
                    loopcontinue()
                }
                
                var_3_26D = and:int(var_3_26D:int, ldc:int(1847045578))
                
                if (logicalnot:boolean(invokevirtual:boolean(Object::equals, invokevirtual:Class<? extends \u93a2\u97b7\u647c\ud36e\u64ab>[expected:Object](\u93a2\u97b7\u647c\ud36e\u64ab::getClass, p0:\u93a2\u97b7\u647c\ud36e\u64ab), invokevirtual:Class<? extends \u93a2\u97b7\u647c\ud36e\u64ab>[expected:Object](\u93a2\u97b7\u647c\ud36e\u64ab::getClass, p1:\u93a2\u97b7\u647c\ud36e\u64ab)))) {
                    return:boolean(and:int[expected:boolean](ldc:int(-24125), ldc:int(24072)))
                }
            }
            
            Label_0307:
            
            if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(262144)), ldc:int(0))) {
                var_3_26D = and:int(var_3_26D:int, ldc:int(170281771))
                goto(Label_0449)
            }
            
            if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(2048)), ldc:int(0))) {
                var_3_26D = and:int(var_3_26D:int, ldc:int(2019025131))
            }
            else {
                if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0229)
                }
                
                if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(256)), ldc:int(0))) {
                    var_3_26D = and:int(var_3_26D:int, ldc:int(1121099549))
                    goto(Label_0161)
                }
                
                if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(1024)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_26D = and:int(var_3_26D:int, ldc:int(-1350697569))
                
                if (instanceof:boolean(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, p0:\u93a2\u97b7\u647c\ud36e\u64ab)) {
                    var_5_24D = checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, p0:\u93a2\u97b7\u647c\ud36e\u64ab[expected:\uc31c\uc87f\uc246\u3776\ub7dc])
                    var_6_253 = checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, p1:\u93a2\u97b7\u647c\ud36e\u64ab[expected:\uc31c\uc87f\uc246\u3776\ub7dc])
                    var_7_25F = invokeinterface:Iterator<String>(Set<String>::iterator, invokevirtual:Set<String>(\uc31c\uc87f\uc246\u3776\ub7dc::\ua068\u92ff\u873d\u9033\u99f7\ubefe, var_5_24D:\uc31c\uc87f\uc246\u3776\ub7dc))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_26D = and:int(var_3_26D:int, ldc:int(2132733384))
                            
                            if (invokeinterface:boolean(Iterator::hasNext, var_7_25F:Iterator)) {
                                var_8_2A4 = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_7_25F:Iterator<String>))
                                
                                if (invokestatic:boolean(\u946b\u92ee\u6fb0\ua6bd\ubefe::\u3a62\u8413\u4f4a\ub83f\uc910\u3d64, invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u8d98\u624e\u6ec6\ud4fe\u40a9\u8709, var_5_24D:\uc31c\uc87f\uc246\u3776\ub7dc, var_8_2A4:String), invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u8d98\u624e\u6ec6\ud4fe\u40a9\u8709, var_6_253:\uc31c\uc87f\uc246\u3776\ub7dc, var_8_2A4:String), p2:boolean)) {
                                    var_3_26D = and:int(var_3_26D:int, ldc:int(926190987))
                                    loopcontinue()
                                }
                                
                                return:boolean(and:int[expected:boolean](ldc:int(24850), ldc:int(-24851)))
                            }
                        }
                        
                        if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(262144)), ldc:int(0))) {
                            return:boolean(xor:int[expected:boolean](ldc:int(2052), ldc:int(2053)))
                        }
                        
                        var_3_26D = and:int(var_3_26D:int, ldc:int(-2050466540))
                    }
                }
            }
            
            Label_0378:
            
            if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(64)), ldc:int(0))) {
                var_3_26D = and:int(var_3_26D:int, ldc:int(1638034438))
            }
            else {
                if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0307)
                }
                
                if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_26D = and:int(var_3_26D:int, ldc:int(-1273074368))
                    goto(Label_0229)
                }
                
                if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(64)), ldc:int(0))) {
                    var_3_26D = and:int(var_3_26D:int, ldc:int(-1209916157))
                    goto(Label_0161)
                }
                
                if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(64)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_26D = and:int(var_3_26D:int, ldc:int(-1342316593))
                
                if (instanceof:boolean(\u36d3\u9033\u6b0d\u983f\u8d90.\ud158\u8308\u76bc\u0a06\ud36e.class, p0:\u93a2\u97b7\u647c\ud36e\u64ab)) {
                    if (p2:boolean) {
                        var_5_2EA = checkcast:\ud158\u8308\u76bc\u0a06\ud36e(\u36d3\u9033\u6b0d\u983f\u8d90.\ud158\u8308\u76bc\u0a06\ud36e.class, p0:\u93a2\u97b7\u647c\ud36e\u64ab[expected:\ud158\u8308\u76bc\u0a06\ud36e])
                        var_6_2F0 = checkcast:\ud158\u8308\u76bc\u0a06\ud36e(\u36d3\u9033\u6b0d\u983f\u8d90.\ud158\u8308\u76bc\u0a06\ud36e.class, p1:\u93a2\u97b7\u647c\ud36e\u64ab[expected:\ud158\u8308\u76bc\u0a06\ud36e])
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\ud158\u8308\u76bc\u0a06\ud36e::isEmpty, var_5_2EA:\ud158\u8308\u76bc\u0a06\ud36e))) {
                            var_3_37E = and:int(var_3_26D:int, ldc:int(-1245782263))
                            var_7_307 = and:int(ldc:int(71), ldc:int(-72))
                            
                            while (cmplt:boolean(var_7_307:int, invokevirtual:int(\ud158\u8308\u76bc\u0a06\ud36e::size, var_5_2EA:\ud158\u8308\u76bc\u0a06\ud36e))) {
                                var_8_340 = invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\ud158\u8308\u76bc\u0a06\ud36e::get, var_5_2EA:\ud158\u8308\u76bc\u0a06\ud36e, var_7_307:int)
                                var_9_349 = and:int(ldc:int(19168), ldc:int(-27361))
                                var_10_352 = and:int(ldc:int(-15199), ldc:int(4948))
                                
                                loop {
                                    if (cmpeq:boolean(and:int(var_3_37E:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_0916)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_37E:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_3_37E = and:int(var_3_37E:int, ldc:int(1876225823))
                                        
                                        if (cmplt:boolean(var_10_352:int, invokevirtual:int(\ud158\u8308\u76bc\u0a06\ud36e::size, var_6_2F0:\ud158\u8308\u76bc\u0a06\ud36e))) {
                                            if (logicalnot:boolean(invokestatic:boolean(\u946b\u92ee\u6fb0\ua6bd\ubefe::\u3a62\u8413\u4f4a\ub83f\uc910\u3d64, var_8_340:\u93a2\u97b7\u647c\ud36e\u64ab, invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\ud158\u8308\u76bc\u0a06\ud36e::get, var_6_2F0:\ud158\u8308\u76bc\u0a06\ud36e, var_10_352:int), p2:boolean))) {
                                                var_3_37E = and:int(var_3_37E:int, ldc:int(-1355289298))
                                                inc:int(var_10_352, ldc:int(1))
                                                loopcontinue()
                                            }
                                            
                                            var_9_349 = xor:int(ldc:int(16457), ldc:int(16456))
                                        }
                                    }
                                    
                                    Label_0882:
                                    
                                    if (cmpne:boolean(and:int(var_3_37E:int, ldc:int(8388608)), ldc:int(0))) {
                                        var_3_37E = and:int(var_3_37E:int, ldc:int(-2053262304))
                                    }
                                    else {
                                        if (cmpeq:boolean(and:int(var_3_37E:int, ldc:int(32768)), ldc:int(0))) {
                                            loopcontinue()
                                        }
                                        
                                        var_3_37E = and:int(var_3_37E:int, ldc:int(-159908083))
                                        
                                        if (cmpeq:boolean(var_9_349:int, ldc:int(0))) {
                                            return:boolean(and:int[expected:boolean](ldc:int(-30402), ldc:int(14016)))
                                        }
                                    }
                                    
                                    Label_0916:
                                    
                                    if (cmpeq:boolean(and:int(var_3_37E:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_3_37E = and:int(var_3_37E:int, ldc:int(1364600230))
                                        goto(Label_0882)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_37E:int, ldc:int(536870912)), ldc:int(0))) {
                                        var_3_37E = and:int(var_3_37E:int, ldc:int(922726301))
                                        inc:int(var_7_307, ldc:int(1))
                                        looporswitchbreak()
                                    }
                                    
                                    var_3_37E = and:int(var_3_37E:int, ldc:int(-164942155))
                                }
                            }
                            
                            return:boolean(and:int[expected:boolean](ldc:int(527), ldc:int(24577)))
                        }
                        
                        return:boolean(invokevirtual:boolean(\ud158\u8308\u76bc\u0a06\ud36e::isEmpty, var_6_2F0:\ud158\u8308\u76bc\u0a06\ud36e))
                    }
                }
            }
            
            Label_0449:
            
            if (cmpeq:boolean(and:int(var_3_26D:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0378)
            }
            
            if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(64)), ldc:int(0))) {
                var_3_26D = and:int(var_3_26D:int, ldc:int(766139678))
                goto(Label_0307)
            }
            
            if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0229)
            }
            
            if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(134217728)), ldc:int(0))) {
                var_3_26D = and:int(var_3_26D:int, ldc:int(-2126631452))
                goto(Label_0161)
            }
            
            if (cmpne:boolean(and:int(var_3_26D:int, ldc:int(67108864)), ldc:int(0))) {
                return:boolean(invokevirtual:boolean(Object::equals, p0:\u93a2\u97b7\u647c\ud36e\u64ab[expected:Object], p1:\u93a2\u97b7\u647c\ud36e\u64ab[expected:Object]))
            }
            
            var_3_26D = and:int(var_3_26D:int, ldc:int(-447932958))
        }
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ucb79\uf995\u3d64\u64f2\ucef1 \ud158\u3d64\ubf56\u36d3\ube23\u8308(java.util.UUID p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\ucb79\uf995\u3d64\u64f2\ucef1(initobject:\ucb79\uf995\u3d64\u64f2\ucef1(\ucb79\uf995\u3d64\u64f2\ucef1::<init>, invokestatic:int[](\ub70c\u6d99\u760c\uc3e3\u516c\uff55::\u8d98\u4e72\u6b5f\u183a\ub83f\u51b2, p0:UUID)))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.UUID \u6b0d\ud12e\u47c2\ub102\u3bd6\uc238(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab p0) {
        var_3_7B : int[]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        
        if (cmpne:boolean(invokeinterface:\u7bad\uc238\u3a62\ua562\u7af6<?>(\u93a2\u97b7\u647c\ud36e\u64ab::\u6bb9\ub18d\u51fa\u51fa\u72f1\uc910, p0:\u93a2\u97b7\u647c\ud36e\u64ab), getstatic:\u7bad\uc238\u3a62\ua562\u7af6<\ucb79\uf995\u3d64\u64f2\ucef1>(\ucb79\uf995\u3d64\u64f2\ucef1::\ua6bd\u6d99\u6b0d\ua068\u839e\u59ec))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), xor:int(ldc:int(22657), ldc:int(22660)))), invokeinterface:String(\u7bad\uc238\u3a62\ua562\u7af6<T>::\uc84e\u5245\ua6bd\u0a06\u34df\u946b, getstatic:\u7bad\uc238\u3a62\ua562\u7af6<\ucb79\uf995\u3d64\u64f2\ucef1>(\ucb79\uf995\u3d64\u64f2\ucef1::\ua6bd\u6d99\u6b0d\ua068\u839e\u59ec))), loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(583), ldc:int(2094)))), invokeinterface:String(\u7bad\uc238\u3a62\ua562\u7af6<T>::\uc84e\u5245\ua6bd\u0a06\u34df\u946b, invokeinterface:\u7bad\uc238\u3a62\ua562\u7af6<?>(\u93a2\u97b7\u647c\ud36e\u64ab::\u6bb9\ub18d\u51fa\u51fa\u72f1\uc910, p0:\u93a2\u97b7\u647c\ud36e\u64ab))), loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(7), ldc:int(17415)))))))
        }
        
        var_3_7B = invokevirtual:int[](\ucb79\uf995\u3d64\u64f2\ucef1::\u4daf\u67d0\u76bc\ud36e\ub1b9\u120d, checkcast:\ucb79\uf995\u3d64\u64f2\ucef1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ucb79\uf995\u3d64\u64f2\ucef1.class, p0:\u93a2\u97b7\u647c\ud36e\u64ab[expected:\ucb79\uf995\u3d64\u64f2\ucef1]))
        
        if (cmpeq:boolean(arraylength:int(var_3_7B:int[]), xor:int(ldc:int(1110), ldc:int(1106)))) {
            return:UUID(invokestatic:UUID(\ub70c\u6d99\u760c\uc3e3\u516c\uff55::\ubefe\ucb79\u71f1\u5db4\u59ec\u600f, var_3_7B:int[]))
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), xor:int(ldc:int(2688), ldc:int(2696)))), arraylength:int(var_3_7B:int[])), loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), xor:int(ldc:int(-12285), ldc:int(-12284)))))))
    }
    
    public static \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u7e3f\u4492\u760c\u6bb9\u4c2b\u4c04(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), xor:int(ldc:int(6152), ldc:int(6145)))), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(1034), ldc:int(25003)))), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(20971), ldc:int(2075))))))
        }
        
        goto(Label_0006)
    }
    
    public static \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u8bb0\u8350\ubcb0\u4179\u965f\u4d85(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_3_69 : \uc31c\uc87f\uc246\u3776\ub7dc
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_69 = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_3_69:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), xor:int(ldc:int(16404), ldc:int(16413))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_3_69:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), xor:int(ldc:int(67), ldc:int(73))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_3_69:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), xor:int(ldc:int(-30716), ldc:int(-30705))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
            return:\uc31c\uc87f\uc246\u3776\ub7dc(var_3_69:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    public static \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \u72f1\u1833\u97b7\u600f\u6cfe\u3e2a(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
        var_1_61 : int
        var_1_12A : int
        var_3_9B : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        var_4_A0 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_5_E0 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_6_E6 : \ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>
        var_7_F2 : Iterator<String>
        var_8_115 : String
        var_9_11E : \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_1_61 = and:int(ldc:int(226240656), ldc:int(-1980273465))
        
        if (invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(-7856), ldc:int(7339))), ldc:int(8))) {
            var_1_12A = and:int(var_1_61:int, ldc:int(-889263128))
            var_3_9B = checkcast:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u3776\uc2bd\uc246\ufcaf\u4975\u0800, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255), initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(466), ldc:int(-467)))))))
            var_4_A0 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, var_3_9B:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)
            
            if (invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), xor:int(ldc:int(517), ldc:int(519))), ldc:int(10))) {
                var_5_E0 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(106), ldc:int(4482))))
                var_6_E6 = invokevirtual:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u51b2\u72f1\ubcb0\uc87f\u2dcc\u92ee, var_3_9B:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)
                var_7_F2 = invokeinterface:Iterator<String>(Set<String>::iterator, invokevirtual:Set<String>(\uc31c\uc87f\uc246\u3776\ub7dc::\ua068\u92ff\u873d\u9033\u99f7\ubefe, var_5_E0:\uc31c\uc87f\uc246\u3776\ub7dc))
                
                loop {
                    var_1_12A = and:int(var_1_12A:int, ldc:int(2129524958))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_7_F2:Iterator<String>))) {
                        looporswitchbreak()
                    }
                    
                    var_8_115 = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_7_F2:Iterator<String>))
                    var_9_11E = invokevirtual:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937::\u8753\u927d\u51b2\ub102\u4ab3\u1833, var_6_E6:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937, var_8_115:String)
                    
                    if (cmpne:boolean(var_9_11E:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, aconstnull:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d())) {
                        var_4_A0 = checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokestatic:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u946b\u92ee\u6fb0\ua6bd\ubefe::\ufe34\u446c\u927d\ua6bd\u40a9\u873d, var_4_A0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, var_9_11E:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>, var_8_115:String, var_5_E0:\uc31c\uc87f\uc246\u3776\ub7dc, p0:\uc31c\uc87f\uc246\u3776\ub7dc))
                    }
                    
                    var_1_12A = and:int(var_1_12A:int, ldc:int(1819240954))
                }
            }
            
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(var_4_A0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
        }
        
        return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd)))
    }
    
    private static S extends \u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c<?, S> \ufe34\u446c\u927d\ua6bd\u40a9\u873d(S extends \u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c<?, S> p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T> p1, java.lang.String p2, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p3, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p4) {
        var_7_6E : Optional<T>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_7_6E = invokevirtual:Optional<T>(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u873d\uc87f\ucef1\u9033\u3bc9\u6bb9, p1:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, p3:\uc31c\uc87f\uc246\u3776\ub7dc, p2:String))
        
        if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_7_6E:Optional<T>))) {
            invokeinterface:void(Logger::warn, getstatic:Logger(\u946b\u92ee\u6fb0\ua6bd\ubefe::\uafe7\u6b5f\ubff1\u51fa\u4d85\u51b2), loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), xor:int(ldc:int(5139), ldc:int(5151))), p2:String[expected:Object], invokevirtual:String[expected:Object](\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, p3:\uc31c\uc87f\uc246\u3776\ub7dc, p2:String), invokevirtual:String[expected:Object](\uc31c\uc87f\uc246\u3776\ub7dc::toString, p4:\uc31c\uc87f\uc246\u3776\ub7dc))
            return:S extends \uc31c\u74b1\u8389\u494c\u88c5\u446c<?, S>(p0:S extends \uc31c\u74b1\u8389\u494c\u88c5\u446c<?, S>)
        }
        
        return:S extends \uc31c\u74b1\u8389\u494c\u88c5\u446c<?, S>(checkcast:S extends \uc31c\u74b1\u8389\u494c\u88c5\u446c<?, S>(S extends \u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c<?, S>.class, invokevirtual:Object(\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, Object>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, p0:S extends \uc31c\u74b1\u8389\u494c\u88c5\u446c<?, S>[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, Object>], p1:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, checkcast:T extends Comparable<T>(T extends java.lang.Comparable<T>.class, invokevirtual:T extends Comparable<T>(Optional<T>::get, var_7_6E:Optional<T>)))))
    }
    
    public static \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ub6ab\ubf56\u6c56\u7006\u946b\u5654(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
        var_1_B8 : int
        var_3_69 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_4_8A : ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>
        var_5_A7 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_6_B1 : UnmodifiableIterator
        var_7_EC : Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, V>
        var_8_F8 : \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_B8 = and:int(ldc:int(-2017955977), ldc:int(-944046093))
            var_3_69 = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, var_3_69:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(-31636), ldc:int(10898))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255), invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))))
            var_4_8A = invokevirtual:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u9af2\u61a4\u965f\u4492\u156b\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>])
            
            if (logicalnot:boolean(invokevirtual:boolean(ImmutableMap::isEmpty, var_4_8A:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>))) {
                var_5_A7 = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
                var_6_B1 = invokevirtual:UnmodifiableIterator(ImmutableSet::iterator, invokevirtual:ImmutableSet(ImmutableMap::entrySet, var_4_8A:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>))
                
                loop {
                    var_1_B8 = and:int(var_1_B8:int, ldc:int(1999891885))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_B1:UnmodifiableIterator[expected:Iterator]))) {
                        looporswitchbreak()
                    }
                    
                    var_7_EC = checkcast:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, V>(java.util.Map.Entry<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, V>.class, invokeinterface:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, V>(Iterator<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, V>>::next, var_6_B1:Iterator<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, V>>))
                    var_8_F8 = checkcast:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<java.lang.Comparable>.class, invokeinterface:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>(Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>, V>::getKey, var_7_EC:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>, V>))
                    invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, var_5_A7:\uc31c\uc87f\uc246\u3776\ub7dc, invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, var_8_F8:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d), invokestatic:String(\u946b\u92ee\u6fb0\ua6bd\ubefe::\ud4fe\ubf56\ub83f\u8709\uc238\ucfaf, var_8_F8:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>, checkcast:Comparable(java.lang.Comparable.class, invokeinterface:V[expected:Comparable<?>](Entry<K, V>::getValue, var_7_EC:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>, V>))))
                }
                
                var_1_B8 = and:int(var_1_B8:int, ldc:int(-1006927951))
                invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_3_69:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c), and:int(ldc:int(258), ldc:int(3715))), var_5_A7:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
            }
            
            return:\uc31c\uc87f\uc246\u3776\ub7dc(var_3_69:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String \ud4fe\ubf56\ub83f\u8709\uc238\ucfaf(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T> p0, java.lang.Comparable<?> p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:String(invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, p1:T extends Comparable<T>))
        }
        
        goto(Label_0006)
    }
    
    public static \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ub19c\u7af6\uc238\u1833\u8709\u946b(com.mojang.datafixers.DataFixer p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c p1, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p2, int p3) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc31c\uc87f\uc246\u3776\ub7dc(invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u946b\u92ee\u6fb0\ua6bd\ubefe::\ub19c\u7af6\uc238\u1833\u8709\u946b, p0:DataFixer, p1:\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c, p2:\uc31c\uc87f\uc246\u3776\ub7dc, p3:int, invokeinterface:int(GameVersion::getWorldVersion, invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a))))
        }
        
        goto(Label_0006)
    }
    
    public static \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \ub19c\u7af6\uc238\u1833\u8709\u946b(com.mojang.datafixers.DataFixer p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c p1, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p2, int p3, int p4) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc31c\uc87f\uc246\u3776\ub7dc(checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, invokevirtual:Object[expected:\uc31c\uc87f\uc246\u3776\ub7dc](Dynamic::getValue, invokeinterface:Dynamic(DataFixer::update, p0:DataFixer, invokevirtual:DSL$TypeReference(\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c::\u12cb\ua3b4\u5245\u6d99\u3d4b\u4c04, p1:\uceb8\u7bad\u9af2\ub7dc\ubf56\u647c), initobject:Dynamic(Dynamic::<init>, getstatic:\u760c\uf995\uae5d\u446c\uceb8[expected:DynamicOps](\u760c\uf995\uae5d\u446c\uceb8::\u6d99\u8350\u9255\u8640\uf9c5\ud36e), p2:\uc31c\uc87f\uc246\u3776\ub7dc[expected:Object]), p3:int, p4:int))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_38A : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_DA_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_134_0 : byte[] [generated]
        stack_335_0 : byte[] [generated]
        stack_39D_0 : byte[] [generated]
        stack_41A_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_2C6 : byte[]
        var_4_2C7 : int
        expr_A6 : int [generated]
        var_5_317 : int
        var_3_31C : byte[]
        var_4_31D : int
        expr_338 : byte [generated]
        var_0_393 : int
        expr_39D : byte [generated]
        stack_3E5_2 : byte [generated]
        stack_3C2_0 : byte [generated]
        expr_DC : int [generated]
        expr_109 : int [generated]
        var_3_408 : byte[]
        var_4_409 : int
        var_3_140 : String
        stack_2B7_0 : String[] [generated]
        expr_152 : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_0_38A = and:int(ldc:int(551667417), ldc:int(-1195252490))
            expr_68 = var_2_6C = stack_A4_0 = stack_A6_0 = stack_DA_0 = stack_DC_0 = stack_107_0 = stack_109_0 = stack_134_0 = stack_335_0 = stack_39D_0 = stack_41A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("GAlwhXaMDXfn+zCoGuyhf2tv90lfUNkhRszQ+O3UjJvUF3fqEIPgHXiaGJKV7xn59BYYCXCFdowNd+kEgJ4MoX9rb/dJX1DZK3iy02ish/QXd+oQg/AkhJ4ByRFnVhDWlJa0gp6pfodpdospdINsgoyQkJdHa096u2v0soP0N3VwDcKWoogfaX6Gny3akJ1aLVt4B86PUJ4rRzH8mL1cEX9pYW9vcgaano1mlX0L+pigthd5aptvX1Pp6+3g"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_2C6 = newarray:byte[](byte.class, expr_70:int)
                var_4_2C7 = expr_70:int
                
                loop {
                    var_0_38A = and:int(var_0_38A:int, ldc:int(766369522))
                    var_4_2C7 = add:int(var_4_2C7:int, ldc:int(-1))
                    storeelement:byte(var_3_2C6:byte[], var_4_2C7:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_2C7:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_2C7:int, and:int(ldc:int(2097), ldc:int(5007)))), ldc:int(5)), and:int(ldc:int(3719), ldc:int(71)))))
                    
                    if (cmpne:boolean(var_4_2C7:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_DA_0 = stack_DC_0 = stack_107_0 = stack_109_0 = stack_134_0 = stack_335_0 = stack_39D_0 = stack_41A_0 = var_3_2C6:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(8192)), ldc:int(0))) {
                    var_0_38A = and:int(var_0_38A:int, ldc:int(-1328950537))
                    goto(Label_0270)
                }
                
                if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(8192)), ldc:int(0))) {
                    var_0_38A = and:int(var_0_38A:int, ldc:int(364558907))
                    goto(Label_0225)
                }
                
                if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0171)
                }
                
                var_0_38A = and:int(var_0_38A:int, ldc:int(-90311175))
                expr_A6 = arraylength:int(stack_A6_0:byte[])
                
                if (cmpeq:boolean(expr_A6:int, ldc:int(0))) {
                    goto(Label_0171)
                }
                
                var_5_317 = expr_A6:int
                var_3_31C = newarray:byte[](byte.class, expr_A6:int)
                var_4_31D = expr_A6:int
                Label_0799:
                
                while (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(32)), ldc:int(0))) {
                    var_0_38A = and:int(var_0_38A:int, ldc:int(-843331889))
                    var_4_31D = add:int(var_4_31D:int, ldc:int(-1))
                    expr_338 = xor:byte(loadelement:byte(stack_335_0:byte[], var_4_31D:int), ldc:byte(75))
                    storeelement:byte(var_3_31C:byte[], var_4_31D:int, or:int(and:int(shl:int(expr_338:byte, and:int(ldc:int(16388), ldc:int(10821))), ldc:int(-16)), and:int(shr:int(expr_338:byte[expected:int], and:int(ldc:int(4436), ldc:int(10758))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_31D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A6_0 = stack_A4_0 = stack_DA_0 = stack_DC_0 = stack_107_0 = stack_109_0 = stack_134_0 = stack_335_0 = stack_39D_0 = stack_41A_0 = var_3_31C:byte[]
                    goto(Label_0171)
                }
                
                Label_0893:
                
                while (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_393 = and:int(var_0_38A:int, ldc:int(-1494093995))
                    var_4_31D = add:int(var_4_31D:int, ldc:int(-1))
                    expr_39D = stack_3E5_2 = loadelement(stack_39D_0, var_4_31D)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_31D:int, ldc:int(4)), neg:int(var_5_317:int)), ldc:int(0))) {
                        stack_3E5_2 = stack_3C2_0 = add:byte(expr_39D:byte, loadelement:byte(var_3_31C:byte[], add:int(var_4_31D:int, ldc:int(4))))
                        goto(Label_0978)
                    }
                    
                    Label_0938:
                    
                    if (cmpne:boolean(and:int(var_0_393:int, ldc:int(32)), ldc:int(0))) {
                        var_0_393 = and:int(var_0_393:int, ldc:int(-830390864))
                    }
                    else {
                        var_0_393 = and:int(var_0_393:int, ldc:int(1704324975))
                        stack_3E5_2 = stack_3C2_0 = add:byte(expr_39D:byte, ldc:byte(4))
                    }
                    
                    Label_0978:
                    
                    if (cmpeq:boolean(and:int(var_0_393:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    var_0_38A = and:int(var_0_393:int, ldc:int(1504698090))
                    storeelement:byte(var_3_31C:byte[], var_4_31D:int, stack_3E5_2:byte)
                    
                    if (cmpne:boolean(var_4_31D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A6_0 = stack_A4_0 = stack_DA_0 = stack_DC_0 = stack_107_0 = stack_109_0 = stack_134_0 = stack_335_0 = stack_39D_0 = stack_41A_0 = var_3_31C:byte[]
                    goto(Label_0225)
                }
                
                var_0_38A = and:int(var_0_38A:int, ldc:int(-2085852510))
                goto(Label_0799)
                Label_0171:
                
                if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_38A = and:int(var_0_38A:int, ldc:int(238168628))
                    goto(Label_0270)
                }
                
                if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_38A = and:int(var_0_38A:int, ldc:int(1747579132))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_38A = and:int(var_0_38A:int, ldc:int(-792736162))
                    expr_DC = arraylength:int(stack_DC_0:byte[])
                    
                    if (cmpne:boolean(expr_DC:int, ldc:int(0))) {
                        var_5_317 = expr_DC:int
                        var_3_31C = newarray:byte[](byte.class, expr_DC:int)
                        var_4_31D = expr_DC:int
                        goto(Label_0893)
                    }
                }
                
                Label_0225:
                
                if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(8192)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_38A = and:int(var_0_38A:int, ldc:int(-176589504))
                        goto(Label_0171)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_38A = and:int(var_0_38A:int, ldc:int(-2067409156))
                    expr_109 = arraylength:int(stack_109_0:byte[])
                    
                    if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                        var_3_408 = newarray:byte[](byte.class, expr_109:int)
                        var_4_409 = expr_109:int
                        
                        loop {
                            var_0_38A = and:int(var_0_38A:int, ldc:int(-672797446))
                            var_4_409 = add:int(var_4_409:int, ldc:int(-1))
                            storeelement:byte(var_3_408:byte[], var_4_409:int, add:byte(loadelement:byte(stack_41A_0:byte[], var_4_409:int), ldc:byte(20)))
                            
                            if (cmpne:boolean(var_4_409:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A6_0 = stack_A4_0 = stack_DA_0 = stack_DC_0 = stack_107_0 = stack_109_0 = stack_134_0 = stack_335_0 = stack_39D_0 = stack_41A_0 = var_3_408:byte[]
                    }
                }
                
                Label_0270:
                
                if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0225)
                }
                
                if (cmpne:boolean(and:int(var_0_38A:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0171)
                }
                
                if (cmpeq:boolean(and:int(var_0_38A:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_38A = and:int(var_0_38A:int, ldc:int(-893211210))
            }
            
            var_3_140 = initobject:String(String::<init>, stack_134_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_2B7_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(3398), ldc:int(3403)))
            expr_152 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16533), ldc:int(16536)))
            storeelement:String(expr_152:String[], and:int(ldc:int(783), ldc:int(9318)), invokevirtual:String[expected:String](String::substring, var_3_140:String, and:int(ldc:int(-21024), ldc:int(21006)), and:int(ldc:int(13324), ldc:int(236))))
            storeelement:String(expr_152:String[], xor:int(ldc:int(17450), ldc:int(17453)), invokevirtual:String[expected:String](String::substring, var_3_140:String, xor:int(ldc:int(8515), ldc:int(8527)), and:int(ldc:int(10509), ldc:int(525))))
            storeelement:String(expr_152:String[], and:int(ldc:int(2588), ldc:int(12424)), invokevirtual:String[expected:String](String::substring, var_3_140:String, and:int(ldc:int(6477), ldc:int(1087)), and:int(ldc:int(8254), ldc:int(16702))))
            storeelement:String(expr_152:String[], and:int(ldc:int(3589), ldc:int(8589)), invokevirtual:String[expected:String](String::substring, var_3_140:String, and:int(ldc:int(8318), ldc:int(23358)), and:int(ldc:int(17502), ldc:int(10462))))
            storeelement:String(expr_152:String[], xor:int(ldc:int(-24567), ldc:int(-24568)), invokevirtual:String[expected:String](String::substring, var_3_140:String, and:int(ldc:int(5214), ldc:int(18527)), xor:int(ldc:int(145), ldc:int(241))))
            storeelement:String(expr_152:String[], and:int(ldc:int(9222), ldc:int(-9223)), invokevirtual:String[expected:String](String::substring, var_3_140:String, and:int(ldc:int(96), ldc:int(9464)), and:int(ldc:int(4724), ldc:int(17900))))
            storeelement:String(expr_152:String[], and:int(ldc:int(16898), ldc:int(230)), invokevirtual:String[expected:String](String::substring, var_3_140:String, and:int(ldc:int(484), ldc:int(8294)), xor:int(ldc:int(2), ldc:int(108))))
            storeelement:String(expr_152:String[], xor:int(ldc:int(-29693), ldc:int(-29689)), invokevirtual:String[expected:String](String::substring, var_3_140:String, and:int(ldc:int(367), ldc:int(9326)), xor:int(ldc:int(8763), ldc:int(8780))))
            storeelement:String(expr_152:String[], xor:int(ldc:int(142), ldc:int(130)), invokevirtual:String[expected:String](String::substring, var_3_140:String, xor:int(ldc:int(10299), ldc:int(10316)), xor:int(ldc:int(16607), ldc:int(16491))))
            storeelement:String(expr_152:String[], and:int(ldc:int(75), ldc:int(163)), invokevirtual:String[expected:String](String::substring, var_3_140:String, and:int(ldc:int(9974), ldc:int(180)), and:int(ldc:int(4793), ldc:int(9725))))
            storeelement:String(expr_152:String[], xor:int(ldc:int(-32756), ldc:int(-32763)), invokevirtual:String[expected:String](String::substring, var_3_140:String, and:int(ldc:int(185), ldc:int(18879)), and:int(ldc:int(1018), ldc:int(6335))))
            storeelement:String(expr_152:String[], xor:int(ldc:int(-32762), ldc:int(-32756)), invokevirtual:String[expected:String](String::substring, var_3_140:String, and:int(ldc:int(698), ldc:int(8379)), and:int(ldc:int(4863), ldc:int(443))))
            storeelement:String(expr_152:String[], and:int(ldc:int(5455), ldc:int(16555)), invokevirtual:String[expected:String](String::substring, var_3_140:String, xor:int(ldc:int(17522), ldc:int(17609)), and:int(ldc:int(188), ldc:int(9404))))
            putstatic:String[](\u946b\u92ee\u6fb0\ua6bd\ubefe::\u7043\u416d\u4f4a\u8753\u8258\u446c, expr_152:String[])
            putstatic:Logger(\u946b\u92ee\u6fb0\ua6bd\ubefe::\uafe7\u6b5f\ubff1\u51fa\u4d85\u51b2, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u97b7\u98a4\u385b\u5140\u0c95\uc4d2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65B : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_666 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_65B = and:int(ldc:int(1624433825), ldc:int(-222562394))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u946b\u92ee\u6fb0\ua6bd\ubefe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(16)), ldc:int(0))) {
            var_3_65B = and:int(var_3_65B:int, ldc:int(2110580474))
            var_5_80 = and:int(ldc:int(2698), ldc:int(-2699))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-7454), ldc:int(7437)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_65B:int, ldc:int(1875682350))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, xor:int(ldc:int(624), ldc:int(625)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, xor:int(ldc:int(1280), ldc:int(1281)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_65B = and:int(var_3_CF:int, ldc:int(1737796734))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(261), ldc:int(1673)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(364049476))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1041753416))
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1274677755))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-988576455))
                    }
                    else {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-206258624))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0544)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0392:
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1970261724))
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1321962915))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(925607441))
                            loopcontinue()
                        }
                        
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-503386726))
                        var_11_E0 = and:int(ldc:int(6088), ldc:int(-6089))
                        goto(Label_1499)
                    }
                    
                    Label_0544:
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-799439688))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1907919448))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(989392090))
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(266249399))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-1999923246))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-1116289518))
                            loopcontinue()
                        }
                        
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-471466961))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0683:
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1561142027))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1294874132))
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(410376060))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(722747198))
                            goto(Label_0544)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-1811895011))
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1962849994))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(106445648))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1750093372))
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-951400811))
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1877522499))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-2002238701))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0544)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(1906233902))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-38421388))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = xor:int(ldc:int(5192), ldc:int(5193))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0957:
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1369843122))
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(2025335685))
                            goto(Label_0544)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-654537969))
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-141824328))
                        var_11_E0 = and:int(ldc:int(18501), ldc:int(-19574))
                    }
                    
                    Label_1101:
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(2053523495))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-1338853646))
                            goto(Label_0957)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-2100022029))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0544)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-741298499))
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65B = and:int(var_3_65B:int, ldc:int(2141646326))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1359)
                            }
                        }
                    }
                    
                    Label_1221:
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1915802156))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1644195588))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1101)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0957)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-780436269))
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(230311346))
                            goto(Label_0544)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-1496666431))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_65B = and:int(var_3_65B:int, ldc:int(-326763141))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                            goto(Label_1499)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1359:
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1448606226))
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(271254565))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(345018400))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1934451859))
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-924839034))
                        goto(Label_0544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65B = and:int(var_3_65B:int, ldc:int(-106961695))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1499:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_666 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1510:
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-769752852))
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(2088952095))
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-1502229821))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-376282510))
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(1086308922))
                        goto(Label_0392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_65B = and:int(var_3_65B:int, ldc:int(-191174935))
                        var_17_666 = add:int(var_16_10E:int, and:int(ldc:int(18725), ldc:int(4251)))
                        looporswitchbreak()
                    }
                }
                
                var_3_65B = and:int(var_3_65B:int, ldc:int(-489819100))
                
                if (cmple:boolean(var_5_80 = var_17_666:int, sub:int(var_6_87:int, xor:int(ldc:int(-20464), ldc:int(-20463))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_65B:int, ldc:int(1024)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
