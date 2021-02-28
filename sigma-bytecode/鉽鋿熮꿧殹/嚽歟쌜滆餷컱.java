public final class \u927d\u92ff\u71ae\uafe7\u6bb9.\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1 {
    public void \u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1(java.security.cert.X509Certificate[] p0) {
        var_5_74 : int
        var_6_7D : int
        var_7_98 : X509Certificate
        var_8_9F : X500Principal
        var_9_AF : Set<X509Certificate>
        
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
            invokespecial:\uc4d2\u8709\ud4fe\uc246\ua562\u4bc8(\uc4d2\u8709\ud4fe\uc246\ua562\u4bc8::<init>, this:\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1)
            putfield:Map<X500Principal, Set<X509Certificate>>(\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1::\ua6bd\u3776\u8350\uceb8\u385b\u385b, this:\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1, initobject:LinkedHashMap<X500Principal, Set<X509Certificate>>[expected:Map<X500Principal, Set<X509Certificate>>](LinkedHashMap<K, V>::<init>))
            var_5_74 = arraylength:int(p0:X509Certificate[])
            var_6_7D = and:int(ldc:int(7964), ldc:int(-7967))
            
            while (cmplt:boolean(var_6_7D:int, var_5_74:int)) {
                var_7_98 = loadelement:X509Certificate(p0:X509Certificate[], var_6_7D:int)
                var_8_9F = invokevirtual:X500Principal(X509Certificate::getSubjectX500Principal, var_7_98:X509Certificate)
                var_9_AF = checkcast:Set<X509Certificate>(java.util.Set<java.security.cert.X509Certificate>.class, invokeinterface:Set<X509Certificate>(Map<X500Principal, Set<X509Certificate>>::get, getfield:Map<X500Principal, Set<X509Certificate>>(\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1::\ua6bd\u3776\u8350\uceb8\u385b\u385b, this:\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1), var_8_9F:X500Principal[expected:Object]))
                
                if (cmpeq:boolean(var_9_AF:Set<X509Certificate>, aconstnull:Set<X509Certificate>())) {
                    var_9_AF = initobject:LinkedHashSet<X509Certificate>[expected:Set<X509Certificate>](LinkedHashSet<E>::<init>, xor:int(ldc:int(16512), ldc:int(16513)))
                    invokeinterface:Set<X509Certificate>(Map<X500Principal, Set<X509Certificate>>::put, getfield:Map<X500Principal, Set<X509Certificate>>(\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1::\ua6bd\u3776\u8350\uceb8\u385b\u385b, this:\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1), var_8_9F:X500Principal, var_9_AF:Set<X509Certificate>)
                }
                
                invokeinterface:boolean(Set<X509Certificate>::add, var_9_AF:Set<X509Certificate>, var_7_98:X509Certificate)
                inc:int(var_6_7D, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.security.cert.X509Certificate \ua562\u5db4\ub6ab\u64f2\u4d85\uc29a(java.security.cert.X509Certificate p0) {
        var_2_64 : int
        var_4_69 : X500Principal
        var_2_6F : int
        var_5_7E : Set<X509Certificate>
        var_2_E5 : int
        var_6_BA : Iterator<X509Certificate>
        var_2_C7 : int
        var_2_ED : int
        var_7_F8 : X509Certificate
        var_2_123 : int
        var_8_104 : PublicKey
        stack_12B_0 : X509Certificate [generated]
        
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
        var_2_64 = and:int(and:int(ldc:int(676034331), ldc:int(256606193)), ldc:int(-1729364013))
        var_4_69 = invokevirtual:X500Principal(X509Certificate::getIssuerX500Principal, p0:X509Certificate)
        var_2_6F = and:int(var_2_64:int, ldc:int(726658897))
        var_5_7E = checkcast:Set<X509Certificate>(java.util.Set<java.security.cert.X509Certificate>.class, invokeinterface:Set<X509Certificate>(Map<X500Principal, Set<X509Certificate>>::get, getfield:Map<X500Principal, Set<X509Certificate>>(\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1::\ua6bd\u3776\u8350\uceb8\u385b\u385b, this:\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1), var_4_69:X500Principal[expected:Object]))
        
        loop {
            if (cmpne:boolean(and:int(var_2_6F:int, ldc:int(33554432)), ldc:int(0))) {
                var_2_E5 = and:int(var_2_6F:int, ldc:int(680020308))
            }
            else {
                var_2_E5 = and:int(var_2_6F:int, ldc:int(669740989))
                
                if (cmpne:boolean(var_5_7E:Set<X509Certificate>, aconstnull:Set<X509Certificate>())) {
                    var_6_BA = invokeinterface:Iterator<X509Certificate>(Set<X509Certificate>::iterator, var_5_7E:Set<X509Certificate>)
                    
                    loop {
                        if (cmpne:boolean(and:int(var_2_E5:int, ldc:int(32768)), ldc:int(0))) {
                            var_2_C7 = and:int(var_2_E5:int, ldc:int(-579035238))
                        }
                        else {
                            var_2_C7 = and:int(var_2_E5:int, ldc:int(-1182795945))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_BA:Iterator))) {
                                looporswitchbreak()
                            }
                        }
                        
                        if (cmpne:boolean(and:int(var_2_C7:int, ldc:int(131072)), ldc:int(0))) {
                            var_2_ED = and:int(var_2_C7:int, ldc:int(1019998033))
                            var_7_F8 = checkcast:X509Certificate(java.security.cert.X509Certificate.class, invokeinterface:X509Certificate(Iterator<X509Certificate>::next, var_6_BA:Iterator<X509Certificate>))
                            var_2_123 = and:int(var_2_ED:int, ldc:int(-1393557603))
                            var_8_104 = invokevirtual:PublicKey(Certificate::getPublicKey, var_7_F8:X509Certificate[expected:Certificate])
                            
                            try {
                                do {
                                    if (cmpne:boolean(and:int(var_2_123:int, ldc:int(4194304)), ldc:int(0))) {
                                        var_2_123 = and:int(var_2_123:int, ldc:int(-1067483151))
                                        invokevirtual:void(Certificate::verify, p0:X509Certificate[expected:Certificate], var_8_104:PublicKey)
                                    }
                                } while (cmpeq:boolean(and:int(var_2_123:int, ldc:int(65536)), ldc:int(0)))
                                
                                var_2_123 = and:int(var_2_123:int, ldc:int(1064269661))
                                stack_12B_0 = var_7_F8:X509Certificate
                                var_2_123 = and:int(var_2_123:int, ldc:int(1323034417))
                                return:X509Certificate(stack_12B_0:X509Certificate)
                            }
                            catch (java.lang.Exception var_9_130) {
                                var_2_E5 = and:int(var_2_123:int, ldc:int(1567584247))
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        var_2_E5 = and:int(var_2_C7:int, ldc:int(47654645))
                    }
                    
                    return:X509Certificate(aconstnull:X509Certificate())
                }
            }
            
            if (cmpne:boolean(and:int(var_2_E5:int, ldc:int(65536)), ldc:int(0))) {
                return:X509Certificate(aconstnull:X509Certificate())
            }
            
            var_2_6F = and:int(var_2_E5:int, ldc:int(724721497))
        }
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_8B : int
        stack_CC_0 : int [generated]
        
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
        var_2_8B = and:int(ldc:int(-589024556), ldc:int(-67126437))
        
        if (cmpne:boolean(p0:Object, this:\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1[expected:Object])) {
            loop {
                if (cmpne:boolean(and:int(var_2_8B:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_8B = and:int(var_2_8B:int, ldc:int(1335468308))
                }
                else {
                    var_2_8B = and:int(var_2_8B:int, ldc:int(-85265726))
                    
                    if (instanceof:boolean(\u927d\u92ff\u71ae\uafe7\u6bb9.\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1.class, p0:Object)) {
                        if (invokeinterface:boolean(Map<K, V>::equals, getfield:Map<X500Principal, Set<X509Certificate>>(\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1::\ua6bd\u3776\u8350\uceb8\u385b\u385b, checkcast:\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1(\u927d\u92ff\u71ae\uafe7\u6bb9.\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1.class, p0:Object[expected:\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1])), getfield:Map<X500Principal, Set<X509Certificate>>[expected:Object](\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1::\ua6bd\u3776\u8350\uceb8\u385b\u385b, this:\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1))) {
                            stack_CC_0 = and:int(ldc:int(29145), ldc:int(1029))
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_8B:int, ldc:int(2)), ldc:int(0))) {
                    var_2_8B = and:int(var_2_8B:int, ldc:int(-957843576))
                    stack_CC_0 = and:int(ldc:int(-1632), ldc:int(1055))
                    looporswitchbreak()
                }
            }
            
            return:boolean(stack_CC_0:int)
        }
        
        return:boolean(xor:int[expected:boolean](ldc:int(649), ldc:int(648)))
    }
    
    public int hashCode() {
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
            return:int(invokeinterface:int(Map<K, V>::hashCode, getfield:Map<X500Principal, Set<X509Certificate>>(\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1::\ua6bd\u3776\u8350\uceb8\u385b\u385b, this:\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1)))
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8709\ucfaf\uc2e8\ud4fe\u718f\u8c8a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_613 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_61E : int
        
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
        var_3_613 = and:int(ldc:int(1153249919), ldc:int(-730480282))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u56bd\u6b5f\uc31c\u6ec6\u9937\ucef1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_613 = and:int(var_3_613:int, ldc:int(-937971721))
            var_5_7D = and:int(ldc:int(5361), ldc:int(-5626))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(27457), ldc:int(-27458)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_613:int, ldc:int(-37970178))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(16400), ldc:int(16401)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(1), ldc:int(93)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_613 = and:int(var_3_D2:int, ldc:int(1381433535))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(2820), ldc:int(2821)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1991746649))
                        goto(Label_1158)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(4)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1844061792))
                        goto(Label_1023)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1258996970))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(32)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1929522370))
                    }
                    else {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-953117258))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-277145746))
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1845915098))
                        goto(Label_1158)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1023)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(2109394998))
                            var_11_E3 = and:int(ldc:int(17897), ldc:int(-26602))
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(4)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1835331662))
                        goto(Label_1158)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-254572375))
                        goto(Label_1023)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-643622166))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-1401577730))
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(-810354314))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1823401970))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-730520519))
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(881326393))
                        goto(Label_1158)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1023)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1567331416))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1573866053))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-1324148018))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(720028785))
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(1641335991))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-42554017))
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1158)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1023)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-798709898))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(1881776462))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(2030229364))
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(1202999278))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(1328), ldc:int(1329))
                                goto(Label_1023)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1546863235))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1158)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(1460828662))
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(1859350327))
                        var_11_E3 = and:int(ldc:int(-27021), ldc:int(26892))
                    }
                    
                    Label_1023:
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-1827990710))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-1211413370))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(128)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-1533273988))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-1097472249))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(2022398484))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(749081243))
                            loopcontinue()
                        }
                        
                        var_3_613 = and:int(var_3_613:int, ldc:int(1859182446))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1294)
                            }
                        }
                    }
                    
                    Label_1158:
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1175925249))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-302380423))
                            goto(Label_1023)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(775861538))
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-1445334055))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(343310769))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_613 = and:int(var_3_613:int, ldc:int(-914400074))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1294:
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1385193258))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1158)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1023)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(638774288))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(2)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1809442091))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-1973531989))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(796286113))
                        loopcontinue()
                    }
                    
                    var_3_613 = and:int(var_3_613:int, ldc:int(1706114094))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1431:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61E = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1442:
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(164099275))
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1158)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(621060455))
                        goto(Label_1023)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-454816653))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(32)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(1204430762))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_613:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_613:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_613 = and:int(var_3_613:int, ldc:int(-998977802))
                        var_17_61E = add:int(var_16_111:int, and:int(ldc:int(16385), ldc:int(1825)))
                        looporswitchbreak()
                    }
                    
                    var_3_613 = and:int(var_3_613:int, ldc:int(10709406))
                }
                
                var_3_613 = and:int(var_3_613:int, ldc:int(-416002129))
                
                if (cmple:boolean(var_5_7D = var_17_61E:int, sub:int(var_6_84:int, xor:int(ldc:int(22592), ldc:int(22593))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_613:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_613 = and:int(var_3_613:int, ldc:int(-319632984))
            goto(Label_0106)
        }
    }
}
