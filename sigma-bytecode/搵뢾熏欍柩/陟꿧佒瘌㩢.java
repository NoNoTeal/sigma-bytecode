public class \u6435\ub8be\u718f\u6b0d\u67e9.\u965f\uafe7\u4f52\u760c\u3a62 {
    public void \u965f\uafe7\u4f52\u760c\u3a62(javax.net.ssl.X509TrustManager p0) {
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
            invokespecial:Object(Object::<init>, this:\u965f\uafe7\u4f52\u760c\u3a62)
            putfield:X509TrustManager(\u965f\uafe7\u4f52\u760c\u3a62::\u76bc\u5db4\u7e3f\ub102\ucfaf, this:\u965f\uafe7\u4f52\u760c\u3a62, p0:X509TrustManager)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void checkClientTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1) {
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
            invokeinterface:void(X509TrustManager::checkClientTrusted, getfield:X509TrustManager(\u965f\uafe7\u4f52\u760c\u3a62::\u76bc\u5db4\u7e3f\ub102\ucfaf, this:\u965f\uafe7\u4f52\u760c\u3a62), p0:X509Certificate[], p1:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1) {
        var_3_12F : int
        var_5_67 : int
        var_6_E1 : Iterator<List<?>>
        
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
        var_3_12F = and:int(ldc:int(-1092918529), ldc:int(-1308889458))
        var_5_67 = and:int(ldc:int(3057), ldc:int(-3058))
        
        loop {
            if (cmpeq:boolean(and:int(var_3_12F:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0184)
            }
            
            if (cmpeq:boolean(and:int(var_3_12F:int, ldc:int(16384)), ldc:int(0))) {
                var_3_12F = and:int(var_3_12F:int, ldc:int(-1838893951))
            }
            else {
                var_3_12F = and:int(var_3_12F:int, ldc:int(-252189009))
                
                if (cmplt:boolean(var_5_67:int, arraylength:int(p0:X509Certificate[]))) {
                    if (cmpeq:boolean(invokevirtual:Collection<List<?>>(X509Certificate::getSubjectAlternativeNames, loadelement:X509Certificate(p0:X509Certificate[], var_5_67:int)), aconstnull:Collection<List<?>>())) {
                        goto(Label_0184)
                    }
                    
                    var_6_E1 = invokeinterface:Iterator<List<?>>(Collection<List<?>>::iterator, invokevirtual:Collection<List<?>>(X509Certificate::getSubjectAlternativeNames, loadelement:X509Certificate(p0:X509Certificate[], var_5_67:int)))
                    
                    loop {
                        var_3_12F = and:int(var_3_12F:int, ldc:int(-1292508530))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_E1:Iterator))) {
                            goto(Label_0184)
                        }
                        
                        if (invokevirtual:boolean(String::endsWith, checkcast:String(java.lang.String.class, invokeinterface:String(List<String>::get, checkcast:List<String>(java.util.List<java.lang.String>.class, invokeinterface:List<String>(Iterator<List<String>>::next, var_6_E1:Iterator<List<String>>)), and:int(ldc:int(16451), ldc:int(12313)))), loadelement:String(getstatic:String[](\u965f\uafe7\u4f52\u760c\u3a62::\u8df4\u983f\u7330\ua6bd\uc2e8), and:int(ldc:int(2398), ldc:int(-28127))))) {
                            if (logicalnot:boolean(invokevirtual:boolean(String::equals, invokeinterface:String(Principal::toString, invokevirtual:Principal(X509Certificate::getIssuerDN, loadelement:X509Certificate(p0:X509Certificate[], var_5_67:int))), loadelement:String[expected:Object](getstatic:String[](\u965f\uafe7\u4f52\u760c\u3a62::\u8df4\u983f\u7330\ua6bd\uc2e8), and:int(ldc:int(8577), ldc:int(2561)))))) {
                                if (logicalnot:boolean(invokevirtual:boolean(String::equals, invokeinterface:String(Principal::toString, invokevirtual:Principal(X509Certificate::getIssuerDN, loadelement:X509Certificate(p0:X509Certificate[], var_5_67:int))), loadelement:String[expected:Object](getstatic:String[](\u965f\uafe7\u4f52\u760c\u3a62::\u8df4\u983f\u7330\ua6bd\uc2e8), xor:int(ldc:int(198), ldc:int(196)))))) {
                                    athrow(initobject:CertificateException(CertificateException::<init>))
                                }
                            }
                        }
                        
                        var_3_12F = and:int(var_3_12F:int, ldc:int(-1713412442))
                    }
                }
            }
            
            Label_0139:
            
            if (cmpne:boolean(and:int(var_3_12F:int, ldc:int(8388608)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_3_12F:int, ldc:int(268435456)), ldc:int(0))) {
                    invokeinterface:void(X509TrustManager::checkServerTrusted, getfield:X509TrustManager(\u965f\uafe7\u4f52\u760c\u3a62::\u76bc\u5db4\u7e3f\ub102\ucfaf, this:\u965f\uafe7\u4f52\u760c\u3a62), p0:X509Certificate[], p1:String)
                    return:void()
                }
                
                loopcontinue()
            }
            
            Label_0184:
            
            if (cmpeq:boolean(and:int(var_3_12F:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0139)
            }
            
            if (cmpne:boolean(and:int(var_3_12F:int, ldc:int(2048)), ldc:int(0))) {
                loopcontinue()
            }
            
            var_3_12F = and:int(var_3_12F:int, ldc:int(-757762322))
            inc:int(var_5_67, ldc:int(1))
        }
    }
    
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
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
            return:X509Certificate[](invokeinterface:X509Certificate[](X509TrustManager::getAcceptedIssuers, getfield:X509TrustManager(\u965f\uafe7\u4f52\u760c\u3a62::\u76bc\u5db4\u7e3f\ub102\ucfaf, this:\u965f\uafe7\u4f52\u760c\u3a62)))
        }
        
        goto(Label_0006)
    }
    
    public static \u6435\ub8be\u718f\u6b0d\u67e9.\u965f\uafe7\u4f52\u760c\u3a62 \u4daf\u71ae\ub1b9\u8cae\u647c() {
        var_2_6B : TrustManagerFactory
        var_3_7F : X509TrustManager
        var_4_84 : TrustManager[]
        var_5_89 : int
        var_6_92 : int
        var_7_A0 : TrustManager
        var_4_CF : SSLContext
        var_5_D9 : \u965f\uafe7\u4f52\u760c\u3a62
        stack_F4_0 : SSLContext [generated]
        stack_F4_1 : KeyManager[] [generated]
        expr_E5 : \u965f\uafe7\u4f52\u760c\u3a62[] [generated]
        stack_106_0 : Throwable [generated]
        
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
        
        try {
            var_2_6B = invokestatic:TrustManagerFactory(TrustManagerFactory::getInstance, invokestatic:String(TrustManagerFactory::getDefaultAlgorithm))
            invokevirtual:void(TrustManagerFactory::init, var_2_6B:TrustManagerFactory, checkcast:KeyStore(java.security.KeyStore.class, aconstnull:KeyStore()))
            var_3_7F = aconstnull:X509TrustManager()
            var_4_84 = invokevirtual:TrustManager[](TrustManagerFactory::getTrustManagers, var_2_6B:TrustManagerFactory)
            var_5_89 = arraylength:int(var_4_84:TrustManager[])
            var_6_92 = and:int(ldc:int(-9601), ldc:int(9600))
            
            while (cmplt:boolean(var_6_92:int, var_5_89:int)) {
                var_7_A0 = loadelement:TrustManager(var_4_84:TrustManager[], var_6_92:int)
                
                if (instanceof:boolean(javax.net.ssl.X509TrustManager.class, var_7_A0:TrustManager)) {
                    var_3_7F = checkcast:X509TrustManager(javax.net.ssl.X509TrustManager.class, var_7_A0:X509TrustManager[expected:TrustManager])
                    looporswitchbreak()
                }
                
                inc:int(var_6_92, ldc:int(1))
            }
            
            var_4_CF = invokestatic:SSLContext(SSLContext::getInstance, loadelement:String(getstatic:String[](\u965f\uafe7\u4f52\u760c\u3a62::\u8df4\u983f\u7330\ua6bd\uc2e8), xor:int(ldc:int(-23552), ldc:int(-23549))))
            var_5_D9 = initobject:\u965f\uafe7\u4f52\u760c\u3a62(\u965f\uafe7\u4f52\u760c\u3a62::<init>, var_3_7F:X509TrustManager)
            stack_F4_0 = var_4_CF:SSLContext
            stack_F4_1 = aconstnull:KeyManager[]()
            expr_E5 = newarray:\u965f\uafe7\u4f52\u760c\u3a62[](\u6435\ub8be\u718f\u6b0d\u67e9.\u965f\uafe7\u4f52\u760c\u3a62.class, xor:int(ldc:int(525), ldc:int(524)))
            storeelement:\u965f\uafe7\u4f52\u760c\u3a62(expr_E5:\u965f\uafe7\u4f52\u760c\u3a62[], and:int(ldc:int(12691), ldc:int(-14236)), var_5_D9:\u965f\uafe7\u4f52\u760c\u3a62)
            invokevirtual:void(SSLContext::init, stack_F4_0:SSLContext, stack_F4_1:KeyManager[], expr_E5:\u965f\uafe7\u4f52\u760c\u3a62[][expected:TrustManager[]], aconstnull:SecureRandom())
            invokestatic:void(HttpsURLConnection::setDefaultSSLSocketFactory, invokevirtual:SSLSocketFactory(SSLContext::getSocketFactory, var_4_CF:SSLContext))
            return:\u965f\uafe7\u4f52\u760c\u3a62(var_5_D9:\u965f\uafe7\u4f52\u760c\u3a62)
        }
        catch (java.security.NoSuchAlgorithmException | java.security.KeyManagementException | java.security.KeyStoreException ex_106) {
            invokevirtual:void(Throwable::printStackTrace, stack_106_0:Throwable)
            return:\u965f\uafe7\u4f52\u760c\u3a62(aconstnull:\u965f\uafe7\u4f52\u760c\u3a62())
        }
    }
    
    static {
        var_0_188 : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B1_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_19A_0 : byte[] [generated]
        stack_202_0 : byte[] [generated]
        stack_277_0 : byte[] [generated]
        var_4_175 : int
        var_3_17A : byte[]
        var_5_17B : int
        expr_19A : byte [generated]
        var_0_1F8 : int
        expr_202 : byte [generated]
        stack_246_2 : byte [generated]
        stack_225_0 : byte [generated]
        expr_8F : int [generated]
        var_2_B1 : byte[]
        expr_B5 : int [generated]
        var_3_266 : byte[]
        var_5_267 : int
        var_3_EA : String
        stack_16E_0 : String[] [generated]
        expr_FC : String[] [generated]
        
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
        var_0_188 = and:int(ldc:int(2006441906), ldc:int(1810595691))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_19A_0 = stack_202_0 = stack_277_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("dVdrg1VbW4dX+jkPO/iLt1l3QV/IDXtPQcWno11ze8TlpUtDRUfs44XrKOPVQ39XBxEFPVllg1VXl30P8DUrxhXP0YHxrUvKzAvWZf3Rp7X1gfbIZQs/LyC7T19DW8g1a1Fpycfh/43jHzlbczs1JRM7PV11oc+3QUMiiw9R04MPva+/TX9XV2XM/Dk7zjdddaH/z4N1pf1de5eZlTMpPSlx0htnF2MbWU1PS23xQUVFTWx38/nj8y0=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_175 = expr_6B:int
        var_3_17A = newarray:byte[](byte.class, expr_6B:int)
        var_5_17B = expr_6B:int
        Label_0381:
        
        while (cmpeq:boolean(and:int(var_0_188:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_188 = and:int(var_0_188:int, ldc:int(2010898219))
            var_5_17B = add:int(var_5_17B:int, ldc:int(-1))
            expr_19A = loadelement:byte(stack_19A_0:byte[], var_5_17B:int)
            storeelement:byte(var_3_17A:byte[], var_5_17B:int, add:int(xor:int(or:int(and:int(shl:int(expr_19A:byte, xor:int(ldc:int(2120), ldc:int(2124))), ldc:int(-16)), and:int(shr:int(expr_19A:byte[expected:int], xor:int(ldc:int(2177), ldc:int(2181))), ldc:int(15))), ldc:int(82)), ldc:int(90)))
            
            if (cmpne:boolean(var_5_17B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_19A_0 = stack_202_0 = stack_277_0 = var_3_17A:byte[]
            goto(Label_0112)
        }
        
        var_0_188 = and:int(var_0_188:int, ldc:int(-1839755712))
        Label_0485:
        
        while (cmpne:boolean(and:int(var_0_188:int, ldc:int(32)), ldc:int(0))) {
            var_0_1F8 = and:int(var_0_188:int, ldc:int(1341382459))
            var_5_17B = add:int(var_5_17B:int, ldc:int(-1))
            expr_202 = stack_246_2 = loadelement(stack_202_0, var_5_17B)
            
            if (cmplt:boolean(add:int(add:int(var_5_17B:int, ldc:int(6)), neg:int(var_4_175:int)), ldc:int(0))) {
                stack_246_2 = stack_225_0 = add:byte(expr_202:byte, loadelement:byte(var_3_17A:byte[], add:int(var_5_17B:int, ldc:int(6))))
                goto(Label_0565)
            }
            
            Label_0527:
            
            if (cmpeq:boolean(and:int(var_0_1F8:int, ldc:int(2)), ldc:int(0))) {
                var_0_1F8 = and:int(var_0_1F8:int, ldc:int(-919259468))
            }
            else {
                var_0_1F8 = and:int(var_0_1F8:int, ldc:int(385867258))
                stack_246_2 = stack_225_0 = add:byte(expr_202:byte, ldc:byte(6))
            }
            
            Label_0565:
            
            if (cmpeq:boolean(and:int(var_0_1F8:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0527)
            }
            
            var_0_188 = and:int(var_0_1F8:int, ldc:int(1862008738))
            storeelement:byte(var_3_17A:byte[], var_5_17B:int, stack_246_2:byte)
            
            if (cmpne:boolean(var_5_17B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_19A_0 = stack_202_0 = stack_277_0 = var_3_17A:byte[]
            goto(Label_0148)
        }
        
        var_0_188 = and:int(var_0_188:int, ldc:int(1251300720))
        goto(Label_0381)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0186)
        }
        
        if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_188 = and:int(var_0_188:int, ldc:int(1965825965))
        }
        else {
            var_0_188 = and:int(var_0_188:int, ldc:int(1722277367))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_175 = expr_8F:int
                var_3_17A = newarray:byte[](byte.class, expr_8F:int)
                var_5_17B = expr_8F:int
                goto(Label_0485)
            }
        }
        
        Label_0148:
        
        if (cmpne:boolean(and:int(var_0_188:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(1024)), ldc:int(0))) {
                var_0_188 = and:int(var_0_188:int, ldc:int(-125039684))
                goto(Label_0112)
            }
            
            var_0_188 = and:int(var_0_188:int, ldc:int(1202449919))
            var_2_B1 = stack_B1_0:byte[]
            expr_B5 = add:int(arraylength:int(stack_B3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_3_266 = newarray:byte[](byte.class, expr_B5:int)
                var_5_267 = expr_B5:int
                
                loop {
                    var_0_188 = and:int(var_0_188:int, ldc:int(-963907661))
                    var_5_267 = add:int(var_5_267:int, ldc:int(-1))
                    storeelement:byte(var_3_266:byte[], var_5_267:int, add:int(shl:int(loadelement:byte(stack_277_0:byte[], var_5_267:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_B1:byte[], add:int(var_5_267:int, xor:int(ldc:int(16896), ldc:int(16897)))), ldc:int(5)), and:int(ldc:int(24599), ldc:int(5391)))))
                    
                    if (cmpne:boolean(var_5_267:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_19A_0 = stack_202_0 = stack_277_0 = var_3_266:byte[]
            }
        }
        
        Label_0186:
        
        if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(131072)), ldc:int(0))) {
            var_0_188 = and:int(var_0_188:int, ldc:int(-483165689))
            goto(Label_0148)
        }
        
        if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_188 = and:int(var_0_188:int, ldc:int(-820584378))
            goto(Label_0112)
        }
        
        var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_16E_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-30623), ldc:int(-30619)))
        expr_FC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1220), ldc:int(27173)))
        storeelement:String(expr_FC:String[], xor:int(ldc:int(12288), ldc:int(12289)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(10114), ldc:int(-10115)), and:int(ldc:int(3183), ldc:int(16623))))
        storeelement:String(expr_FC:String[], and:int(ldc:int(514), ldc:int(18730)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(17135), ldc:int(14463)), and:int(ldc:int(253), ldc:int(8615))))
        storeelement:String(expr_FC:String[], and:int(ldc:int(2243), ldc:int(16939)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(1080), ldc:int(1181)), and:int(ldc:int(16568), ldc:int(172))))
        storeelement:String(expr_FC:String[], and:int(ldc:int(-27328), ldc:int(10767)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(4537), ldc:int(8424)), and:int(ldc:int(442), ldc:int(4344))))
        putstatic:String[](\u965f\uafe7\u4f52\u760c\u3a62::\u8df4\u983f\u7330\ua6bd\uc2e8, expr_FC:String[])
    }
    
    public void \u6cfe\u16f6\u7006\ubefe\ubcb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_646 : int
        var_5_7F : int
        var_6_86 : int
        var_7_95 : double
        var_9_C5 : double
        var_3_D7 : int
        var_11_E8 : int
        var_14_112 : double
        var_16_116 : int
        var_12_10E : double
        var_17_651 : int
        
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
        var_3_646 = and:int(ldc:int(27019498), ldc:int(-826404618))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u965f\uafe7\u4f52\u760c\u3a62[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0169)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
            var_3_646 = and:int(var_3_646:int, ldc:int(-762496050))
            var_5_7F = and:int(ldc:int(-18239), ldc:int(17464))
            var_6_86 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_95 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12530), ldc:int(12529)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C5 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D7 = and:int(var_3_646:int, ldc:int(-1564615745))
                    var_9_C5 = sub:double(var_7_95:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E8 = var_5_7F:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E8:int, sub:int(var_6_86:int, and:int(ldc:int(13385), ldc:int(673)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E8:int, xor:int(ldc:int(-16375), ldc:int(-16376)))), var_7_95:double))) {
                        inc:int(var_11_E8, ldc:int(1))
                    }
                    
                    var_3_646 = and:int(var_3_D7:int, ldc:int(-439437930))
                    var_14_112 = var_7_95:double
                    var_16_116 = var_11_E8:int
                }
                else {
                    var_11_E8 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7F:int), xor:int(ldc:int(57), ldc:int(56)))
                    var_12_10E = var_14_112 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F)
                    
                    if (cmplt:boolean(var_16_116 = var_11_E8:int, var_6_86:int)) {
                        var_9_C5 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E8:int)
                        var_16_116 = var_11_E8:int
                        var_14_112 = var_12_10E:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1376020482))
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1790901482))
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1137346555))
                        goto(Label_1231)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(991072092))
                        goto(Label_1136)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(256)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-2091522776))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(256)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-2044470984))
                        goto(Label_0582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1347567378))
                        
                        if (cmplt:boolean(var_16_116:int, var_6_86:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0582)
                            }
                            
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(565879716))
                        goto(Label_1231)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(16)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1896506968))
                        goto(Label_1136)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1393302682))
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1081946791))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(4)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-1433604421))
                            var_11_E8 = and:int(ldc:int(-6998), ldc:int(4948))
                            goto(Label_1485)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0582:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(256)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-2112482696))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1231)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-133102481))
                        goto(Label_1136)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-367236283))
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1548011955))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-1149061150))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(931999730))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_112 = var_9_C5:double
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-535174882))
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(16)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1858969115))
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1830919813))
                        goto(Label_1136)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-323051270))
                        var_14_112 = mul:double(ldc:double(0.5), add:double(var_9_C5:double, var_14_112:double))
                    }
                    
                    Label_0829:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-720361405))
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(210118182))
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1231)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(2124586742))
                        goto(Label_1136)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1939811685))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1065098574))
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-2024451039))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(10423006))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F:int), var_7_95:double)) {
                                var_11_E8 = xor:int(ldc:int(-32575), ldc:int(-32576))
                                goto(Label_1136)
                            }
                        }
                    }
                    
                    Label_0970:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(16)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1838419694))
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-95104612))
                        goto(Label_1231)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1096165360))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0829)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1283491992))
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(224125529))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(649991114))
                        var_11_E8 = and:int(ldc:int(-24631), ldc:int(24630))
                    }
                    
                    Label_1136:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0970)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(242872498))
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(552572034))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                                goto(Label_1354)
                            }
                        }
                    }
                    
                    Label_1231:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1617788024))
                            goto(Label_1136)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0970)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1526882626))
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-809980768))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-1363306825))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_112:double, var_5_7F:int, var_16_116:int)
                            goto(Label_1485)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1354:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-920656423))
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1744274716))
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1136)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(16)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1869379856))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(396550697))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_646 = and:int(var_3_646:int, ldc:int(1223593382))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_112:double, ldc:double(0.0))
                    Label_1485:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_651 = var_5_7F:int
                        
                        if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1496:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1138202189))
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(393287110))
                        goto(Label_1136)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-2089028388))
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(874623092))
                        goto(Label_0582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-406029841))
                        var_17_651 = add:int(var_16_116:int, and:int(ldc:int(369), ldc:int(9869)))
                        looporswitchbreak()
                    }
                }
                
                var_3_646 = and:int(var_3_646:int, ldc:int(99451343))
                
                if (cmple:boolean(var_5_7F = var_17_651:int, sub:int(var_6_86:int, and:int(ldc:int(1699), ldc:int(10241))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0169:
        
        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4)), ldc:int(0))) {
            var_3_646 = and:int(var_3_646:int, ldc:int(1467827265))
            goto(Label_0106)
        }
    }
}
